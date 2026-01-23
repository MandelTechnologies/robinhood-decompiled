package com.robinhood.android.widget.util;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonPersistentListPreference.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/widget/util/NonPersistentListPreference;", "Landroidx/preference/ListPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listener", "Lcom/robinhood/android/widget/util/NonPersistentListPreference$Listener;", "setListener", "", "setValue", "value", "", "Listener", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class NonPersistentListPreference extends ListPreference {
    private Listener listener;

    /* compiled from: NonPersistentListPreference.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/widget/util/NonPersistentListPreference$Listener;", "", "onPreferenceChanged", "", "preferenceKey", "", "value", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Listener {
        void onPreferenceChanged(String preferenceKey, String value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonPersistentListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.preference.ListPreference
    public void setValue(String value) {
        super.setValue(value);
        Listener listener = this.listener;
        if (listener != null) {
            String key = getKey();
            Intrinsics.checkNotNullExpressionValue(key, "getKey(...)");
            listener.onPreferenceChanged(key, value);
        }
    }
}
