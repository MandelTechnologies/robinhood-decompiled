package com.robinhood.android.marketdatadisclosure;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Quote;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: MarketDataDisclosureDialog.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDuxo;", "getDuxo", "()Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "lib-market-data-disclosure_externalDebug", "viewState", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarketDataDisclosureDialog extends GenericComposeDialogFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarketDataDisclosureDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(MarketDataDisclosureDialog marketDataDisclosureDialog, int i, Composer composer, int i2) {
        marketDataDisclosureDialog.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final MarketDataDisclosureDuxo getDuxo() {
        return (MarketDataDisclosureDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1149542408);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1149542408, i2, -1, "com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog.ComposeContent (MarketDataDisclosureDialog.kt:25)");
            }
            MarketDataDisclosureViewState marketDataDisclosureViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MarketDataDisclosureDialog2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            MarketDataDisclosureComposable.MarketDataDisclosureComposable(marketDataDisclosureViewStateComposeContent$lambda$0, function0, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 0);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarketDataDisclosureDialog.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MarketDataDisclosureDialog.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "quote", "Lcom/robinhood/models/db/Quote;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/models/db/Order$Configuration;)V", "getInstrumentId", "()Ljava/util/UUID;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Order.Configuration configuration;
        private final UUID instrumentId;
        private final Quote quote;
        private final EquityOrderSide side;

        /* compiled from: MarketDataDisclosureDialog.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (Quote) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : EquityOrderSide.valueOf(parcel.readString()), parcel.readInt() != 0 ? Order.Configuration.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, Quote quote, EquityOrderSide equityOrderSide, Order.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 2) != 0) {
                quote = args.quote;
            }
            if ((i & 4) != 0) {
                equityOrderSide = args.side;
            }
            if ((i & 8) != 0) {
                configuration = args.configuration;
            }
            return args.copy(uuid, quote, equityOrderSide, configuration);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        /* renamed from: component3, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }

        public final Args copy(UUID instrumentId, Quote quote, EquityOrderSide side, Order.Configuration configuration) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(instrumentId, quote, side, configuration);
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
            return Intrinsics.areEqual(this.instrumentId, args.instrumentId) && Intrinsics.areEqual(this.quote, args.quote) && this.side == args.side && this.configuration == args.configuration;
        }

        public int hashCode() {
            int iHashCode = this.instrumentId.hashCode() * 31;
            Quote quote = this.quote;
            int iHashCode2 = (iHashCode + (quote == null ? 0 : quote.hashCode())) * 31;
            EquityOrderSide equityOrderSide = this.side;
            int iHashCode3 = (iHashCode2 + (equityOrderSide == null ? 0 : equityOrderSide.hashCode())) * 31;
            Order.Configuration configuration = this.configuration;
            return iHashCode3 + (configuration != null ? configuration.hashCode() : 0);
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ", quote=" + this.quote + ", side=" + this.side + ", configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeParcelable(this.quote, flags);
            EquityOrderSide equityOrderSide = this.side;
            if (equityOrderSide == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(equityOrderSide.name());
            }
            Order.Configuration configuration = this.configuration;
            if (configuration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(configuration.name());
            }
        }

        public Args(UUID instrumentId, Quote quote, EquityOrderSide equityOrderSide, Order.Configuration configuration) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
            this.quote = quote;
            this.side = equityOrderSide;
            this.configuration = configuration;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Quote getQuote() {
            return this.quote;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: MarketDataDisclosureDialog.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog;", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Args;", "<init>", "()V", "lib-market-data-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarketDataDisclosureDialog, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarketDataDisclosureDialog marketDataDisclosureDialog) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marketDataDisclosureDialog);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarketDataDisclosureDialog newInstance(Args args) {
            return (MarketDataDisclosureDialog) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarketDataDisclosureDialog marketDataDisclosureDialog, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marketDataDisclosureDialog, args);
        }
    }

    private static final MarketDataDisclosureViewState ComposeContent$lambda$0(SnapshotState4<MarketDataDisclosureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
