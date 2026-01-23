package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhMultiButtonDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000  2\u00020\u0001:\u0004\u001d\u001e\u001f B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", RhMultiButtonDialogFragment.ARG_BUTTON_DATA, "", "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$ButtonData;", "getButtonData", "()Ljava/util/List;", "buttonData$delegate", "Lkotlin/Lazy;", "buttonContainer", "Landroid/widget/LinearLayout;", "getButtonContainer", "()Landroid/widget/LinearLayout;", "buttonContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$OnClickListener;", "getCallbacks", "()Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$OnClickListener;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onButtonClick", WebsocketGatewayConstants.DATA_KEY, "OnClickListener", "Builder", "ButtonData", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RhMultiButtonDialogFragment extends RhDialogFragment {
    private static final String ARG_BUTTON_DATA = "buttonData";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhMultiButtonDialogFragment.class, "buttonContainer", "getButtonContainer()Landroid/widget/LinearLayout;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: buttonData$delegate, reason: from kotlin metadata */
    private final Lazy buttonData = Fragments2.argument(this, ARG_BUTTON_DATA);

    /* renamed from: buttonContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 buttonContainer = bindView(C11048R.id.dialog_fragment_button_container);

    /* compiled from: RhMultiButtonDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$OnClickListener;", "", "onButtonClicked", "", "id", "", RhMultiButtonDialogFragment.ARG_BUTTON_DATA, "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$ButtonData;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnClickListener {
        void onButtonClicked(int id, ButtonData buttonData);
    }

    private final List<ButtonData> getButtonData() {
        return (List) this.buttonData.getValue();
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue(this, $$delegatedProperties[0]);
    }

    public final OnClickListener getCallbacks() {
        ActivityResultCaller targetFragment = getTargetFragment();
        if (targetFragment instanceof OnClickListener) {
            return (OnClickListener) targetFragment;
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getButtonData().isEmpty()) {
            throw new IllegalArgumentException("Must provide at least 1 button but received 0 buttons");
        }
        for (final ButtonData buttonData : getButtonData()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RdsButton rdsButton = new RdsButton(contextRequireContext, null, buttonData.getStyleRes(), 2, null);
            rdsButton.setText(buttonData.getText());
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.ui.RhMultiButtonDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhMultiButtonDialogFragment.onViewCreated$lambda$2$lambda$1(this.f$0, buttonData);
                }
            });
            getButtonContainer().addView(rdsButton);
            ViewsKt.setMarginBottom(rdsButton, ViewsKt.getDimensionPixelSize(rdsButton, C13997R.dimen.rds_spacing_small));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(RhMultiButtonDialogFragment rhMultiButtonDialogFragment, ButtonData buttonData) {
        rhMultiButtonDialogFragment.onButtonClick(buttonData);
        return Unit.INSTANCE;
    }

    private final void onButtonClick(ButtonData data) {
        dismiss();
        if (getCallbacks() != null) {
            OnClickListener callbacks = getCallbacks();
            if (callbacks != null) {
                callbacks.onButtonClicked(getDialogId(), data);
                return;
            }
            return;
        }
        ActivityResultCaller currentFragment = Fragments2.getBaseActivity(this).getCurrentFragment();
        OnClickListener onClickListener = currentFragment instanceof OnClickListener ? (OnClickListener) currentFragment : null;
        if (onClickListener != null) {
            onClickListener.onButtonClicked(getDialogId(), data);
        }
    }

    /* compiled from: RhMultiButtonDialogFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J-\u0010\n\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010\"\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J-\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010\"\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "target", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V", "getTarget", "()Landroidx/fragment/app/Fragment;", "setPositiveButton", "buttonText", "", "resId", "", "args", "", "", "(I[Ljava/lang/Object;)Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "setNegativeButton", "buttonRes", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder extends RhDialogFragment.Builder {
        public static final int $stable = 8;
        private final Fragment target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context, Fragment fragment) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.target = fragment;
        }

        public /* synthetic */ Builder(Context context, Fragment fragment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : fragment);
        }

        public final Fragment getTarget() {
            return this.target;
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public RhDialogFragment.Builder setPositiveButton(CharSequence buttonText) {
            throw new UnsupportedOperationException("Cannot set positive button");
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public RhDialogFragment.Builder setPositiveButton(int resId, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            throw new UnsupportedOperationException("Cannot set positive button");
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public RhDialogFragment.Builder setNegativeButton(CharSequence buttonText) {
            throw new UnsupportedOperationException("Cannot set negative button");
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public RhDialogFragment.Builder setNegativeButton(int buttonRes, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            throw new UnsupportedOperationException("Cannot set negative button");
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            RhMultiButtonDialogFragment rhMultiButtonDialogFragment = new RhMultiButtonDialogFragment();
            Fragment fragment = this.target;
            if (fragment != null) {
                rhMultiButtonDialogFragment.setTargetFragment(fragment, 0);
            }
            return rhMultiButtonDialogFragment;
        }
    }

    /* compiled from: RhMultiButtonDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$ButtonData;", "Landroid/os/Parcelable;", "text", "", "styleRes", "", "<init>", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "getStyleRes", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class ButtonData implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ButtonData> CREATOR = new Creator();
        private final int styleRes;
        private final String text;

        /* compiled from: RhMultiButtonDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ButtonData(parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonData[] newArray(int i) {
                return new ButtonData[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeInt(this.styleRes);
        }

        public ButtonData(String text, int i) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.styleRes = i;
        }

        public String getText() {
            return this.text;
        }

        public /* synthetic */ ButtonData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? C20690R.attr.primaryButtonStyle : i);
        }

        public int getStyleRes() {
            return this.styleRes;
        }
    }

    /* compiled from: RhMultiButtonDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$Companion;", "", "<init>", "()V", "ARG_BUTTON_DATA", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$Builder;", "context", "Landroid/content/Context;", RhMultiButtonDialogFragment.ARG_BUTTON_DATA, "", "Lcom/robinhood/android/common/ui/RhMultiButtonDialogFragment$ButtonData;", "targetFragment", "Landroidx/fragment/app/Fragment;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder create(Context context, List<? extends ButtonData> buttonData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(buttonData, "buttonData");
            Builder builder = new Builder(context, null, 2, 0 == true ? 1 : 0);
            builder.setLayoutRes(C11048R.layout.dialog_fragment_multi_button);
            Bundles.putParcelableList(builder.getDialogArgs(), RhMultiButtonDialogFragment.ARG_BUTTON_DATA, buttonData);
            return builder;
        }

        public final Builder create(Fragment targetFragment, List<? extends ButtonData> buttonData) {
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(buttonData, "buttonData");
            Context contextRequireContext = targetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Builder builder = new Builder(contextRequireContext, targetFragment);
            builder.setLayoutRes(C11048R.layout.dialog_fragment_multi_button);
            Bundles.putParcelableList(builder.getDialogArgs(), RhMultiButtonDialogFragment.ARG_BUTTON_DATA, buttonData);
            return builder;
        }
    }
}
