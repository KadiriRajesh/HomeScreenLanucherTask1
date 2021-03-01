package rajeshkadiri.myhomelanuchertask1;

import android.graphics.drawable.Drawable;

public class AppInfo {
    String label;
    String packageName;
    Drawable icon;

    public CharSequence getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CharSequence getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }
}