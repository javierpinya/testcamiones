package com.javierpinya.testcamiones.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.javierpinya.testcamiones.Clases.VehiculoEntity;
import com.javierpinya.testcamiones.R;

import java.util.List;

public class VehiculosAdapter extends RecyclerView.Adapter<VehiculosAdapter.VehiculosAdapter_Holder> {


    private List<VehiculoEntity> listaVehiculoEntities;
    private AdapterView.OnItemClickListener itemClickListener;

    public VehiculosAdapter(List<VehiculoEntity> listaVehiculoEntities, AdapterView.OnItemClickListener listener){
        this.listaVehiculoEntities = listaVehiculoEntities;
        this.itemClickListener = listener;
    }

    @NonNull
    @Override
    public VehiculosAdapter_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VehiculosAdapter_Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VehiculosAdapter_Holder extends RecyclerView.ViewHolder {
        TextView tvTractora, tvCisterna;
        ImageView ivTractora, ivCisterna, ivTractoraBloqueada, ivCisternaBloqueada, ivTractoraInspeccionada, ivCisternaInspeccionada;

        public VehiculosAdapter_Holder(@NonNull View itemView) {
            super(itemView);

            /* Esto está mal, hay que hacerlo con ViewModel...*/
            tvTractora = itemView.findViewById(R.id.tvTractora);
            tvCisterna = itemView.findViewById(R.id.tvCisterna);
            ivTractora = itemView.findViewById(R.id.ivTractora);
            ivCisterna = itemView.findViewById(R.id.ivCisterna);
            ivTractoraBloqueada = itemView.findViewById(R.id.ivTractoraBloqueada);
            ivCisternaBloqueada = itemView.findViewById(R.id.ivCisternaBloqueada);
            ivTractoraInspeccionada = itemView.findViewById(R.id.ivTractoraInspeccionada);
            ivCisternaInspeccionada = itemView.findViewById(R.id.ivCisternaInspeccionada);
        }

        public void bind(final VehiculoEntity vehiculoEntity, final OnItemClickListener listener){
            this.tvTractora.setText(listaVehiculoEntities.get(getAdapterPosition()).gettMatricula().toString());
            this.tvCisterna.setText(listaVehiculoEntities.get(getAdapterPosition()).getcMatricula().toString());

            if(listaVehiculoEntities.get(getAdapterPosition()).gettTipo().equals("T")){
                this.ivTractora.setImageResource(R.drawable.ic_frontal_truck);
            }else{
                this.ivTractora.setImageResource(R.drawable.ic_oil_truck);
            }

        }
    }

    public interface OnItemClickListener{
        void onItemClick(VehiculosAdapter vehiculosAdapter, int position);
    }
}
