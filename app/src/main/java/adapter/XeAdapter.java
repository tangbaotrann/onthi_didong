package adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.onthididong.R;

import java.util.List;

import model.Xe;

public class XeAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Xe> listXe;
    private int index = -1;

    public XeAdapter(Context context, int idLayout, List<Xe> listXe) {
        this.context = context;
        this.idLayout = idLayout;
        this.listXe = listXe;
    }

    @Override
    public int getCount() {
        if(listXe.size() != 0 && !listXe.isEmpty()) {
            return listXe.size();
        }

        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        ImageView imgvLogo = view.findViewById(R.id.imgvLogo);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        TextView tvPriceBo = view.findViewById(R.id.tvPriceBo);

        final ConstraintLayout constraintLayout = view.findViewById(R.id.idContrainLayout);
        final Xe xe = listXe.get(i);

        if(listXe != null && !listXe.isEmpty()) {
            imgvLogo.setImageResource(xe.getImg());
            tvName.setText(xe.getName());
            tvPrice.setText(xe.getPrice());
            tvPriceBo.setText(xe.getPriceBo());
        }

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, xe.getName(), Toast.LENGTH_SHORT).show();
//                index = i;
//                notifyDataSetChanged();
//            }
//        });
//        if(index == i) {
//            constraintLayout.setBackgroundColor(Color.BLUE);
//        } else {
//            constraintLayout.setBackgroundColor(Color.WHITE);
//        }

        return view;
    }
}
