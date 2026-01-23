package com.robinhood.android.optionchain.tooltips;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.utils.resource.StringResource;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainTooltipView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionchain/tooltips/OptionChainTooltipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "tooltipView", "Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView;", "onAttachedToWindow", "", "bind", "args", "Lcom/robinhood/android/optionchain/tooltips/OptionChainTooltipView$Args;", "callbacks", "Lcom/robinhood/android/optionchain/tooltips/OptionChainTooltipView$Callbacks;", "Callbacks", "Args", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OptionChainTooltipView extends Hammer_OptionChainTooltipView {
    public static final int $stable = 8;
    public Navigator navigator;
    private RdsTooltipView tooltipView;

    /* compiled from: OptionChainTooltipView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionchain/tooltips/OptionChainTooltipView$Callbacks;", "", "setTooltipSeen", "", "onTooltipClicked", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTooltipClicked();

        void setTooltipSeen();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RdsTooltipView rdsTooltipView = new RdsTooltipView(context, null, 2, null);
        rdsTooltipView.setId(View.generateViewId());
        rdsTooltipView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        this.tooltipView = rdsTooltipView;
        addView(rdsTooltipView);
    }

    public final void bind(final Args args, final Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.optionchain.tooltips.OptionChainTooltipView.bind.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionChainTooltipView.this.setVisibility(8);
                OptionChainTooltipView.this.removeAllViews();
                callbacks.onTooltipClicked();
            }
        });
        final RdsTooltipView rdsTooltipView = this.tooltipView;
        RdsTooltipView rdsTooltipView2 = null;
        if (rdsTooltipView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tooltipView");
            rdsTooltipView = null;
        }
        rdsTooltipView.setNibHorizontalBias(args.getNibHorizontalBias());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringResource textRes = args.getTextRes();
        Resources resources = rdsTooltipView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        spannableStringBuilder.append(textRes.getText(resources));
        spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
        StringResource linkTextRes = args.getLinkTextRes();
        Resources resources2 = rdsTooltipView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String string2 = linkTextRes.getText(resources2).toString();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        List listMutableListOf = CollectionsKt.mutableListOf(new ActionSpan(true, new Function0<Unit>() { // from class: com.robinhood.android.optionchain.tooltips.OptionChainTooltipView$bind$lambda$3$lambda$2$$inlined$buildClickableSpannedString$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Navigator navigator = this.this$0.getNavigator();
                Context context = rdsTooltipView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                StringResource linkRes = args.getLinkRes();
                Resources resources3 = rdsTooltipView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, context, linkRes.getText(resources3).toString());
            }
        }));
        listMutableListOf.add(new StyleSpan(1));
        Object[] array2 = listMutableListOf.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
        int length = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) string2);
        for (Object obj : objArrCopyOf) {
            spannableStringBuilder2.setSpan(obj, length, spannableStringBuilder2.length(), 17);
        }
        spannableStringBuilder.append((CharSequence) new SpannedString(spannableStringBuilder2));
        rdsTooltipView.setText(new SpannedString(spannableStringBuilder));
        RdsTooltipView rdsTooltipView3 = this.tooltipView;
        if (rdsTooltipView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tooltipView");
        } else {
            rdsTooltipView2 = rdsTooltipView3;
        }
        rdsTooltipView2.setVisibility(0);
        callbacks.setTooltipSeen();
    }

    /* compiled from: OptionChainTooltipView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionchain/tooltips/OptionChainTooltipView$Args;", "Landroid/os/Parcelable;", "nibHorizontalBias", "", "textRes", "Lcom/robinhood/utils/resource/StringResource;", "linkTextRes", "linkRes", "<init>", "(FLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getNibHorizontalBias", "()F", "getTextRes", "()Lcom/robinhood/utils/resource/StringResource;", "getLinkTextRes", "getLinkRes", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = StringResource.$stable;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final StringResource linkRes;
        private final StringResource linkTextRes;
        private final float nibHorizontalBias;
        private final StringResource textRes;

        /* compiled from: OptionChainTooltipView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readFloat(), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()), (StringResource) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.nibHorizontalBias);
            dest.writeParcelable(this.textRes, flags);
            dest.writeParcelable(this.linkTextRes, flags);
            dest.writeParcelable(this.linkRes, flags);
        }

        public Args(float f, StringResource textRes, StringResource linkTextRes, StringResource linkRes) {
            Intrinsics.checkNotNullParameter(textRes, "textRes");
            Intrinsics.checkNotNullParameter(linkTextRes, "linkTextRes");
            Intrinsics.checkNotNullParameter(linkRes, "linkRes");
            this.nibHorizontalBias = f;
            this.textRes = textRes;
            this.linkTextRes = linkTextRes;
            this.linkRes = linkRes;
        }

        public final float getNibHorizontalBias() {
            return this.nibHorizontalBias;
        }

        public final StringResource getTextRes() {
            return this.textRes;
        }

        public final StringResource getLinkTextRes() {
            return this.linkTextRes;
        }

        public final StringResource getLinkRes() {
            return this.linkRes;
        }
    }
}
