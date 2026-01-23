package com.robinhood.android.options.p208ui.bottomsheet;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: LateCloseBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class LateCloseBottomSheetDialogFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(LateCloseBottomSheetDialogFragment lateCloseBottomSheetDialogFragment, int i, Composer composer, int i2) {
        lateCloseBottomSheetDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1500406225);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1500406225, i2, -1, "com.robinhood.android.options.ui.bottomsheet.LateCloseBottomSheetDialogFragment.ComposeContent (LateCloseBottomSheetDialogFragment.kt:28)");
            }
            Args args = (Args) INSTANCE.getArgs((Fragment) this);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.ui.bottomsheet.LateCloseBottomSheetDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LateCloseBottomSheetDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.ui.bottomsheet.LateCloseBottomSheetDialogFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LateCloseBottomSheetDialogFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionsLateCloseBottomSheetComposable.OptionsLateCloseBottomSheetComposable(args, function0, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.bottomsheet.LateCloseBottomSheetDialogFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LateCloseBottomSheetDialogFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(LateCloseBottomSheetDialogFragment lateCloseBottomSheetDialogFragment) {
        OptionsLateCloseBottomSheetLoggings.logOptionsLateCloseBottomSheetCtaTap(lateCloseBottomSheetDialogFragment.getEventLogger(), ((Args) INSTANCE.getArgs((Fragment) lateCloseBottomSheetDialogFragment)).getScreenName(), UserInteractionEventData.Action.DISMISS, "got-it");
        lateCloseBottomSheetDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(LateCloseBottomSheetDialogFragment lateCloseBottomSheetDialogFragment) {
        OptionsLateCloseBottomSheetLoggings.logOptionsLateCloseBottomSheetCtaTap(lateCloseBottomSheetDialogFragment.getEventLogger(), ((Args) INSTANCE.getArgs((Fragment) lateCloseBottomSheetDialogFragment)).getScreenName(), UserInteractionEventData.Action.VIEW_DEEPLINK, "learn-more");
        lateCloseBottomSheetDialogFragment.dismiss();
        Navigator navigator = lateCloseBottomSheetDialogFragment.getNavigator();
        Context contextRequireContext = lateCloseBottomSheetDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, CuratedListKey.INSTANCE.getLateClosingOptionsListKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* compiled from: LateCloseBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001eR\u001f\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0012\n\u0004\b3\u0010(\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0017R\u001f\u00107\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0012\n\u0004\b7\u00101\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010\u001eR\u001f\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0012\n\u0004\b:\u0010(\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\u0017¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "Landroid/os/Parcelable;", "", "symbol", "j$/time/Instant", "lateCloseTime", "regularCloseTime", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "screenName", "", "selloutTimeToExpiration", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/Long;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/Long;)Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "Lj$/time/Instant;", "getLateCloseTime", "getRegularCloseTime", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getScreenName", "Ljava/lang/Long;", "getSelloutTimeToExpiration", "lateCloseTimeString", "getLateCloseTimeString", "getLateCloseTimeString$annotations", "()V", "extensionTimeInMinutes", "getExtensionTimeInMinutes", "getExtensionTimeInMinutes$annotations", "selloutTimeString", "getSelloutTimeString", "getSelloutTimeString$annotations", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Long extensionTimeInMinutes;
        private final Instant lateCloseTime;
        private final String lateCloseTimeString;
        private final Instant regularCloseTime;
        private final Screen.Name screenName;
        private final String selloutTimeString;
        private final Long selloutTimeToExpiration;
        private String symbol;

        /* compiled from: LateCloseBottomSheetDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), Screen.Name.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, Instant instant, Instant instant2, Screen.Name name, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.symbol;
            }
            if ((i & 2) != 0) {
                instant = args.lateCloseTime;
            }
            if ((i & 4) != 0) {
                instant2 = args.regularCloseTime;
            }
            if ((i & 8) != 0) {
                name = args.screenName;
            }
            if ((i & 16) != 0) {
                l = args.selloutTimeToExpiration;
            }
            Long l2 = l;
            Instant instant3 = instant2;
            return args.copy(str, instant, instant3, name, l2);
        }

        public static /* synthetic */ void getExtensionTimeInMinutes$annotations() {
        }

        public static /* synthetic */ void getLateCloseTimeString$annotations() {
        }

        public static /* synthetic */ void getSelloutTimeString$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getLateCloseTime() {
            return this.lateCloseTime;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getRegularCloseTime() {
            return this.regularCloseTime;
        }

        /* renamed from: component4, reason: from getter */
        public final Screen.Name getScreenName() {
            return this.screenName;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getSelloutTimeToExpiration() {
            return this.selloutTimeToExpiration;
        }

        public final Args copy(String symbol, Instant lateCloseTime, Instant regularCloseTime, Screen.Name screenName, Long selloutTimeToExpiration) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            return new Args(symbol, lateCloseTime, regularCloseTime, screenName, selloutTimeToExpiration);
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
            return Intrinsics.areEqual(this.symbol, args.symbol) && Intrinsics.areEqual(this.lateCloseTime, args.lateCloseTime) && Intrinsics.areEqual(this.regularCloseTime, args.regularCloseTime) && this.screenName == args.screenName && Intrinsics.areEqual(this.selloutTimeToExpiration, args.selloutTimeToExpiration);
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Instant instant = this.lateCloseTime;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.regularCloseTime;
            int iHashCode3 = (((iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.screenName.hashCode()) * 31;
            Long l = this.selloutTimeToExpiration;
            return iHashCode3 + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            return "Args(symbol=" + this.symbol + ", lateCloseTime=" + this.lateCloseTime + ", regularCloseTime=" + this.regularCloseTime + ", screenName=" + this.screenName + ", selloutTimeToExpiration=" + this.selloutTimeToExpiration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.symbol);
            dest.writeSerializable(this.lateCloseTime);
            dest.writeSerializable(this.regularCloseTime);
            dest.writeString(this.screenName.name());
            Long l = this.selloutTimeToExpiration;
            if (l == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l.longValue());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Args(String str, Instant instant, Instant instant2, Screen.Name screenName, Long l) {
            Long lValueOf;
            Duration durationBetween;
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            this.symbol = str;
            this.lateCloseTime = instant;
            this.regularCloseTime = instant2;
            this.screenName = screenName;
            this.selloutTimeToExpiration = l;
            String easternTimeString = null;
            this.lateCloseTimeString = instant != null ? Instants2.toEasternTimeString(instant) : null;
            if (instant == null) {
                lValueOf = null;
            } else {
                if (instant2 != null) {
                    durationBetween = Duration.between(instant2, instant);
                    Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
                } else {
                    durationBetween = null;
                }
                if (durationBetween != null) {
                    lValueOf = Long.valueOf(durationBetween.toMinutes());
                }
            }
            this.extensionTimeInMinutes = lValueOf;
            if (instant != null && l != null) {
                Instant instantMinusSeconds = instant.minusSeconds(l.longValue());
                Intrinsics.checkNotNullExpressionValue(instantMinusSeconds, "minusSeconds(...)");
                easternTimeString = Instants2.toEasternTimeString(instantMinusSeconds);
            }
            this.selloutTimeString = easternTimeString;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final void setSymbol(String str) {
            this.symbol = str;
        }

        public final Instant getLateCloseTime() {
            return this.lateCloseTime;
        }

        public final Instant getRegularCloseTime() {
            return this.regularCloseTime;
        }

        public final Screen.Name getScreenName() {
            return this.screenName;
        }

        public final Long getSelloutTimeToExpiration() {
            return this.selloutTimeToExpiration;
        }

        public final String getLateCloseTimeString() {
            return this.lateCloseTimeString;
        }

        public final Long getExtensionTimeInMinutes() {
            return this.extensionTimeInMinutes;
        }

        public final String getSelloutTimeString() {
            return this.selloutTimeString;
        }
    }

    /* compiled from: LateCloseBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment;", "Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "<init>", "()V", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LateCloseBottomSheetDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LateCloseBottomSheetDialogFragment lateCloseBottomSheetDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, lateCloseBottomSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LateCloseBottomSheetDialogFragment newInstance(Args args) {
            return (LateCloseBottomSheetDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LateCloseBottomSheetDialogFragment lateCloseBottomSheetDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, lateCloseBottomSheetDialogFragment, args);
        }
    }
}
