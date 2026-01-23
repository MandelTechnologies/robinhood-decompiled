package com.robinhood.android.feature.lib.sweep.interest.dialog;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.feature.lib.sweep.interest.C16703R;
import com.robinhood.android.feature.lib.sweep.interest.databinding.SweepPausedInfoDialogBinding;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: SweepPausedInfoDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepPausedInfoDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepPausedInfoDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepPausedInfoDialogBinding;", "binding", "j$/time/Instant", "appearTime", "Lj$/time/Instant;", "Companion", "Args", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SweepPausedInfoDialogFragment extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepPausedInfoDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/feature/lib/sweep/interest/databinding/SweepPausedInfoDialogBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Instant appearTime;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    @ElapsedRealtime
    public Clock clock;
    public EventLogger eventLogger;
    public Navigator navigator;

    /* compiled from: SweepPausedInfoDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSweepsTimelineSummary.PausedReason.values().length];
            try {
                iArr[ApiSweepsTimelineSummary.PausedReason.MARGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSweepsTimelineSummary.PausedReason.PDT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSweepsTimelineSummary.PausedReason.ACCOUNT_DEFICIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SweepPausedInfoDialogFragment() {
        super(C16703R.layout.sweep_paused_info_dialog);
        this.binding = ViewBinding5.viewBinding(this, SweepPausedInfoDialogFragment2.INSTANCE);
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

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    private final SweepPausedInfoDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SweepPausedInfoDialogBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().titleTxt;
        Companion companion = INSTANCE;
        ApiSweepsTimelineSummary.PausedReason pausedReason = ((Args) companion.getArgs((Fragment) this)).getPausedReason();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[pausedReason.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = C16703R.string.sweep_paused_pdt_reason_title;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C16703R.string.sweep_paused_account_deficit_title;
            }
        } else if (((Args) companion.getArgs((Fragment) this)).isInLeveredMarginRegionGate()) {
            i = C16703R.string.sweep_paused_margin_reason_title;
        } else {
            i = C16703R.string.sweep_paused_margin_debit_reason_title;
        }
        rhTextView.setText(getString(i));
        RhTextView rhTextView2 = getBinding().messageTxt;
        int i3 = iArr[((Args) companion.getArgs((Fragment) this)).getPausedReason().ordinal()];
        if (i3 == 1) {
            rhTextView2.setText(getString(C16703R.string.sweep_paused_margin_reason_message));
        } else if (i3 == 2) {
            Intrinsics.checkNotNull(rhTextView2);
            String string2 = ViewsKt.getString(rhTextView2, C16703R.string.sweep_paused_pdt_reason_message);
            num = num.intValue() == 0 ? null : 0;
            TextViewsKt.setTextWithLearnMore((TextView) rhTextView2, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(rhTextView2, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepPausedInfoDialogFragment$onViewCreated$lambda$2$$inlined$setTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    EventLogger.DefaultImpls.logTap$default(this.this$0.getEventLogger(), UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.SWEEP_PAUSED_DIALOG, null, null, 6, null), null, null, false, 58, null);
                    String string3 = this.this$0.getString(C16703R.string.url_pdt_help_center);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string3);
                }
            }, 1, (DefaultConstructorMarker) null));
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            rhTextView2.setText(getString(C16703R.string.sweep_paused_account_deficit_message));
        }
        RdsButton okayBtn = getBinding().okayBtn;
        Intrinsics.checkNotNullExpressionValue(okayBtn, "okayBtn");
        OnClickListeners.onClick(okayBtn, new Function0() { // from class: com.robinhood.android.feature.lib.sweep.interest.dialog.SweepPausedInfoDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SweepPausedInfoDialogFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(SweepPausedInfoDialogFragment sweepPausedInfoDialogFragment) {
        EventLogger.DefaultImpls.logTap$default(sweepPausedInfoDialogFragment.getEventLogger(), UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.SWEEP_PAUSED_DIALOG, null, null, 6, null), null, null, false, 58, null);
        sweepPausedInfoDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.appearTime = Instant.now();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, null, new Component(Component.ComponentType.SWEEP_PAUSED_DIALOG, null, null, 6, null), null, null, 27, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        long millis;
        Instant instant = this.appearTime;
        if (instant != null) {
            Instant instantNow = Instant.now(getClock());
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instant, instantNow);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            millis = durationBetween.toMillis();
        } else {
            millis = 0;
        }
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, null, new Component(Component.ComponentType.SWEEP_PAUSED_DIALOG, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, (int) millis, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 11, null);
        super.onStop();
    }

    /* compiled from: SweepPausedInfoDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepPausedInfoDialogFragment$Args;", "Landroid/os/Parcelable;", "pausedReason", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary$PausedReason;", "isInLeveredMarginRegionGate", "", "<init>", "(Lcom/robinhood/models/api/ApiSweepsTimelineSummary$PausedReason;Z)V", "getPausedReason", "()Lcom/robinhood/models/api/ApiSweepsTimelineSummary$PausedReason;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isInLeveredMarginRegionGate;
        private final ApiSweepsTimelineSummary.PausedReason pausedReason;

        /* compiled from: SweepPausedInfoDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ApiSweepsTimelineSummary.PausedReason.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiSweepsTimelineSummary.PausedReason pausedReason, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                pausedReason = args.pausedReason;
            }
            if ((i & 2) != 0) {
                z = args.isInLeveredMarginRegionGate;
            }
            return args.copy(pausedReason, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSweepsTimelineSummary.PausedReason getPausedReason() {
            return this.pausedReason;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInLeveredMarginRegionGate() {
            return this.isInLeveredMarginRegionGate;
        }

        public final Args copy(ApiSweepsTimelineSummary.PausedReason pausedReason, boolean isInLeveredMarginRegionGate) {
            Intrinsics.checkNotNullParameter(pausedReason, "pausedReason");
            return new Args(pausedReason, isInLeveredMarginRegionGate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.pausedReason == args.pausedReason && this.isInLeveredMarginRegionGate == args.isInLeveredMarginRegionGate;
        }

        public int hashCode() {
            return (this.pausedReason.hashCode() * 31) + Boolean.hashCode(this.isInLeveredMarginRegionGate);
        }

        public String toString() {
            return "Args(pausedReason=" + this.pausedReason + ", isInLeveredMarginRegionGate=" + this.isInLeveredMarginRegionGate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.pausedReason.name());
            dest.writeInt(this.isInLeveredMarginRegionGate ? 1 : 0);
        }

        public Args(ApiSweepsTimelineSummary.PausedReason pausedReason, boolean z) {
            Intrinsics.checkNotNullParameter(pausedReason, "pausedReason");
            this.pausedReason = pausedReason;
            this.isInLeveredMarginRegionGate = z;
        }

        public final ApiSweepsTimelineSummary.PausedReason getPausedReason() {
            return this.pausedReason;
        }

        public final boolean isInLeveredMarginRegionGate() {
            return this.isInLeveredMarginRegionGate;
        }
    }

    /* compiled from: SweepPausedInfoDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepPausedInfoDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepPausedInfoDialogFragment;", "Lcom/robinhood/android/feature/lib/sweep/interest/dialog/SweepPausedInfoDialogFragment$Args;", "<init>", "()V", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepPausedInfoDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepPausedInfoDialogFragment sweepPausedInfoDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepPausedInfoDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepPausedInfoDialogFragment newInstance(Args args) {
            return (SweepPausedInfoDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepPausedInfoDialogFragment sweepPausedInfoDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepPausedInfoDialogFragment, args);
        }
    }
}
