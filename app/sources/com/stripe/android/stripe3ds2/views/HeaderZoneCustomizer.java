package com.stripe.android.stripe3ds2.views;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.stripe.android.stripe3ds2.R$string;
import com.stripe.android.stripe3ds2.R$style;
import com.stripe.android.stripe3ds2.init.p418ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.p418ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HeaderZoneCustomizer.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "customize", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "cancelButtonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HeaderZoneCustomizer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FragmentActivity activity;

    public HeaderZoneCustomizer(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    public final ThreeDS2Button customize(ToolbarCustomization toolbarCustomization, ButtonCustomization cancelButtonCustomization) {
        ActionBar supportActionBar;
        String string2;
        FragmentActivity fragmentActivity = this.activity;
        AppCompatActivity appCompatActivity = fragmentActivity instanceof AppCompatActivity ? (AppCompatActivity) fragmentActivity : null;
        if (appCompatActivity == null || (supportActionBar = appCompatActivity.getSupportActionBar()) == null) {
            return null;
        }
        ThreeDS2Button threeDS2Button = new ThreeDS2Button(new ContextThemeWrapper(this.activity, R$style.Stripe3DS2ActionBarButton), null, 0, 6, null);
        threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
        threeDS2Button.setButtonCustomization(cancelButtonCustomization);
        supportActionBar.setCustomView(threeDS2Button, new ActionBar.LayoutParams(-2, -2, 8388629));
        supportActionBar.setDisplayShowCustomEnabled(true);
        if (toolbarCustomization != null) {
            String buttonText = toolbarCustomization.getButtonText();
            if (buttonText != null && !StringsKt.isBlank(buttonText)) {
                threeDS2Button.setText(toolbarCustomization.getButtonText());
            } else {
                threeDS2Button.setText(R$string.stripe_3ds2_hzv_cancel_label);
            }
            String backgroundColor = toolbarCustomization.getBackgroundColor();
            if (backgroundColor != null) {
                supportActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(backgroundColor)));
                INSTANCE.customizeStatusBar(appCompatActivity, toolbarCustomization);
            }
            String headerText = toolbarCustomization.getHeaderText();
            if (headerText != null && !StringsKt.isBlank(headerText)) {
                string2 = toolbarCustomization.getHeaderText();
                Intrinsics.checkNotNull(string2);
            } else {
                string2 = this.activity.getString(R$string.stripe_3ds2_hzv_header_label);
                Intrinsics.checkNotNull(string2);
            }
            supportActionBar.setTitle(CustomizeUtils.INSTANCE.buildStyledText(this.activity, string2, toolbarCustomization));
            return threeDS2Button;
        }
        supportActionBar.setTitle(R$string.stripe_3ds2_hzv_header_label);
        threeDS2Button.setText(R$string.stripe_3ds2_hzv_cancel_label);
        return threeDS2Button;
    }

    /* compiled from: HeaderZoneCustomizer.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;", "", "()V", "customizeStatusBar", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void customizeStatusBar(AppCompatActivity activity, ToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.getStatusBarColor() != null) {
                CustomizeUtils.INSTANCE.setStatusBarColor(activity, Color.parseColor(toolbarCustomization.getStatusBarColor()));
            } else if (toolbarCustomization.getBackgroundColor() != null) {
                int color = Color.parseColor(toolbarCustomization.getBackgroundColor());
                CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
                customizeUtils.setStatusBarColor(activity, customizeUtils.darken$3ds2sdk_release(color));
            }
        }
    }
}
