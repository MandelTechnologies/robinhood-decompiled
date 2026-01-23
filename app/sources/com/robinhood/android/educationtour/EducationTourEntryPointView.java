package com.robinhood.android.educationtour;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.designsystem.tooltip.RdsTooltipTextView;
import com.robinhood.android.educationtour.databinding.MergeEducationTourTooltipBinding;
import com.robinhood.android.educationtour.extensions.BaseFragments3;
import com.robinhood.android.educationtour.interfaces.EducationTourCallbacks;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.Serializable;
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

/* compiled from: EducationTourEntryPointView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourEntryPointView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/educationtour/databinding/MergeEducationTourTooltipBinding;", "getBindings", "()Lcom/robinhood/android/educationtour/databinding/MergeEducationTourTooltipBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/educationtour/EducationTourEntryPointView$Data;", "hideView", "Data", "Companion", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EducationTourEntryPointView extends ConstraintLayout {
    private static final long FADE_OUT_DURATION = 150;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationTourEntryPointView.class, "bindings", "getBindings()Lcom/robinhood/android/educationtour/databinding/MergeEducationTourTooltipBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationTourEntryPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bindings = ViewBinding5.viewBinding(this, EducationTourEntryPointView3.INSTANCE);
        ViewGroups.inflate(this, C14469R.layout.merge_education_tour_tooltip, true);
        ImageView upTooltipNib = getBindings().upTooltipNib;
        Intrinsics.checkNotNullExpressionValue(upTooltipNib, "upTooltipNib");
        upTooltipNib.setVisibility(8);
        ImageView downTooltipNib = getBindings().downTooltipNib;
        Intrinsics.checkNotNullExpressionValue(downTooltipNib, "downTooltipNib");
        downTooltipNib.setVisibility(8);
    }

    public /* synthetic */ EducationTourEntryPointView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final MergeEducationTourTooltipBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationTourTooltipBinding) value;
    }

    public final void bind(final Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        RdsTooltipTextView rdsTooltipTextView = getBindings().tooltipText;
        Intrinsics.checkNotNull(rdsTooltipTextView, "null cannot be cast to non-null type android.widget.TextView");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsTooltipTextView.setText(LearnMoresKt.buildTextWithLearnMore(resources, data.getMessage(), true, Integer.valueOf(ViewsKt.getColor(this, C11048R.color.rh_white_1)), true, data.getCtaText(), new ClickableSpan() { // from class: com.robinhood.android.educationtour.EducationTourEntryPointView.bind.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                Fragment fragmentFindFragment = FragmentManager.findFragment(EducationTourEntryPointView.this);
                Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "findFragment(...)");
                BaseFragment baseFragment = (BaseFragment) fragmentFindFragment;
                EducationTourEntryPointView.this.hideView();
                String screenName = data.getScreenName();
                String screenUniqueId = data.getScreenUniqueId();
                final Data data2 = data;
                BaseFragments3.showEducationTour$default(baseFragment, screenName, screenUniqueId, new EducationTourCallbacks() { // from class: com.robinhood.android.educationtour.EducationTourEntryPointView$bind$1$onClick$1
                    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
                    public void onShowEducationTour() {
                        data2.getOnShowEducationTour().invoke();
                    }

                    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
                    public void onHideEducationTour() {
                        data2.getOnHideEducationTour().invoke();
                    }
                }, false, false, 24, null);
            }
        }));
        ImageView closeBtn = getBindings().closeBtn;
        Intrinsics.checkNotNullExpressionValue(closeBtn, "closeBtn");
        OnClickListeners.onClick(closeBtn, new Function0() { // from class: com.robinhood.android.educationtour.EducationTourEntryPointView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourEntryPointView.bind$lambda$0(data, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(Data data, EducationTourEntryPointView educationTourEntryPointView) {
        data.getOnHideEducationTour().invoke();
        educationTourEntryPointView.hideView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideView() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        Interpolators interpolators = Interpolators.INSTANCE;
        objectAnimatorOfFloat.setInterpolator(interpolators.getExpandCurveInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setInterpolator(interpolators.getExpandCurveInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.start();
    }

    /* compiled from: EducationTourEntryPointView.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourEntryPointView$Data;", "Landroid/os/Parcelable;", "ctaText", "", "onHideEducationTour", "Lkotlin/Function0;", "", "onShowEducationTour", "message", "screenName", "screenUniqueId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCtaText", "()Ljava/lang/String;", "getOnHideEducationTour", "()Lkotlin/jvm/functions/Function0;", "getOnShowEducationTour", "getMessage", "getScreenName", "getScreenUniqueId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Data implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        private final String ctaText;
        private final String message;
        private final Function0<Unit> onHideEducationTour;
        private final Function0<Unit> onShowEducationTour;
        private final String screenName;
        private final String screenUniqueId;

        /* compiled from: EducationTourEntryPointView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readString(), (Function0) parcel.readSerializable(), (Function0) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public static /* synthetic */ Data copy$default(Data data, String str, Function0 function0, Function0 function02, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.ctaText;
            }
            if ((i & 2) != 0) {
                function0 = data.onHideEducationTour;
            }
            if ((i & 4) != 0) {
                function02 = data.onShowEducationTour;
            }
            if ((i & 8) != 0) {
                str2 = data.message;
            }
            if ((i & 16) != 0) {
                str3 = data.screenName;
            }
            if ((i & 32) != 0) {
                str4 = data.screenUniqueId;
            }
            String str5 = str3;
            String str6 = str4;
            return data.copy(str, function0, function02, str2, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCtaText() {
            return this.ctaText;
        }

        public final Function0<Unit> component2() {
            return this.onHideEducationTour;
        }

        public final Function0<Unit> component3() {
            return this.onShowEducationTour;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component5, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* renamed from: component6, reason: from getter */
        public final String getScreenUniqueId() {
            return this.screenUniqueId;
        }

        public final Data copy(String ctaText, Function0<Unit> onHideEducationTour, Function0<Unit> onShowEducationTour, String message, String screenName, String screenUniqueId) {
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(onHideEducationTour, "onHideEducationTour");
            Intrinsics.checkNotNullParameter(onShowEducationTour, "onShowEducationTour");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            Intrinsics.checkNotNullParameter(screenUniqueId, "screenUniqueId");
            return new Data(ctaText, onHideEducationTour, onShowEducationTour, message, screenName, screenUniqueId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.ctaText, data.ctaText) && Intrinsics.areEqual(this.onHideEducationTour, data.onHideEducationTour) && Intrinsics.areEqual(this.onShowEducationTour, data.onShowEducationTour) && Intrinsics.areEqual(this.message, data.message) && Intrinsics.areEqual(this.screenName, data.screenName) && Intrinsics.areEqual(this.screenUniqueId, data.screenUniqueId);
        }

        public int hashCode() {
            return (((((((((this.ctaText.hashCode() * 31) + this.onHideEducationTour.hashCode()) * 31) + this.onShowEducationTour.hashCode()) * 31) + this.message.hashCode()) * 31) + this.screenName.hashCode()) * 31) + this.screenUniqueId.hashCode();
        }

        public String toString() {
            return "Data(ctaText=" + this.ctaText + ", onHideEducationTour=" + this.onHideEducationTour + ", onShowEducationTour=" + this.onShowEducationTour + ", message=" + this.message + ", screenName=" + this.screenName + ", screenUniqueId=" + this.screenUniqueId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.ctaText);
            dest.writeSerializable((Serializable) this.onHideEducationTour);
            dest.writeSerializable((Serializable) this.onShowEducationTour);
            dest.writeString(this.message);
            dest.writeString(this.screenName);
            dest.writeString(this.screenUniqueId);
        }

        public Data(String ctaText, Function0<Unit> onHideEducationTour, Function0<Unit> onShowEducationTour, String message, String screenName, String screenUniqueId) {
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            Intrinsics.checkNotNullParameter(onHideEducationTour, "onHideEducationTour");
            Intrinsics.checkNotNullParameter(onShowEducationTour, "onShowEducationTour");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            Intrinsics.checkNotNullParameter(screenUniqueId, "screenUniqueId");
            this.ctaText = ctaText;
            this.onHideEducationTour = onHideEducationTour;
            this.onShowEducationTour = onShowEducationTour;
            this.message = message;
            this.screenName = screenName;
            this.screenUniqueId = screenUniqueId;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final Function0<Unit> getOnHideEducationTour() {
            return this.onHideEducationTour;
        }

        public final Function0<Unit> getOnShowEducationTour() {
            return this.onShowEducationTour;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getScreenName() {
            return this.screenName;
        }

        public final String getScreenUniqueId() {
            return this.screenUniqueId;
        }
    }

    /* compiled from: EducationTourEntryPointView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourEntryPointView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/educationtour/EducationTourEntryPointCard;", "<init>", "()V", "FADE_OUT_DURATION", "", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EducationTourEntryPointCard> {
        private final /* synthetic */ Inflater<EducationTourEntryPointCard> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EducationTourEntryPointCard inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EducationTourEntryPointCard) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14469R.layout.include_education_tour_tooltip);
        }
    }
}
