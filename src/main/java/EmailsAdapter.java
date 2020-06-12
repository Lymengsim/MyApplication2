import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.R;

public class EmailsAdapter extends RecyclerView.Adapter<EmailViewHolder> {

    public EmailsAdapter(Email[] emails) {
        this.emails = emails;
    }

    //DataSet
    private Email[] emails;

    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //load a layout view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemview = layoutInflater.inflate(R.layout.email_view_holder, parent , false);

        EmailViewHolder viewHolder = new EmailViewHolder(itemview);
        return new EmailViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {

        Email email = emails[position];
        holder.bind(email);

    }

    @Override
    public int getItemCount() {
        return emails.length;
    }
}
