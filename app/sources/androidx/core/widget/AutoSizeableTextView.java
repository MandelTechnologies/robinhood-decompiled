package androidx.core.widget;

/* loaded from: classes.dex */
public interface AutoSizeableTextView {
    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i);
}
