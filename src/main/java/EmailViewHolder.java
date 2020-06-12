import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmailViewHolder extends RecyclerView.ViewHolder {

    private TextView txtSender;
    private TextView txtSubject;
    private TextView txtBody;
    public EmailViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(Email email){
        txtSender.setText(email.getSender());
        txtBody.setText(email.getBody());
        txtSubject.setText(email.getSubject());
    }
}
