package com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotEnoughSharesDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0013\u0014B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDataState;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesStateProvider;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class NotEnoughSharesDuxo extends BaseDuxo<NotEnoughSharesDataState, NotEnoughSharesViewState> implements HasSavedState {
    private final TraderMarketHoursManager marketHoursManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotEnoughSharesDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, TraderMarketHoursManager marketHoursManager, NotEnoughSharesStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        super(new NotEnoughSharesDataState(((Args) companion.getArgs(savedStateHandle)).getPosition(), ((Args) companion.getArgs(savedStateHandle)).getInstrument(), ((Args) companion.getArgs(savedStateHandle)).getQuote(), ((Args) companion.getArgs(savedStateHandle)).isDollarBasedAmount(), null, 16, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.marketHoursManager = marketHoursManager;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursManager.getCurrentMarketHoursObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotEnoughSharesDuxo.onCreate$lambda$0(this.f$0, (MarketHours) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(NotEnoughSharesDuxo notEnoughSharesDuxo, MarketHours marketHours) {
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        notEnoughSharesDuxo.applyMutation(new NotEnoughSharesDuxo2(marketHours, null));
        return Unit.INSTANCE;
    }

    /* compiled from: NotEnoughSharesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo$Args;", "Landroid/os/Parcelable;", "position", "Lcom/robinhood/models/db/Position;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "isDollarBasedAmount", "", "<init>", "(Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Z)V", "getPosition", "()Lcom/robinhood/models/db/Position;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Instrument instrument;
        private final boolean isDollarBasedAmount;
        private final Position position;
        private final Quote quote;

        /* compiled from: NotEnoughSharesDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Position) parcel.readParcelable(Args.class.getClassLoader()), (Instrument) parcel.readParcelable(Args.class.getClassLoader()), (Quote) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Position position, Instrument instrument, Quote quote, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                position = args.position;
            }
            if ((i & 2) != 0) {
                instrument = args.instrument;
            }
            if ((i & 4) != 0) {
                quote = args.quote;
            }
            if ((i & 8) != 0) {
                z = args.isDollarBasedAmount;
            }
            return args.copy(position, instrument, quote, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component3, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsDollarBasedAmount() {
            return this.isDollarBasedAmount;
        }

        public final Args copy(Position position, Instrument instrument, Quote quote, boolean isDollarBasedAmount) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new Args(position, instrument, quote, isDollarBasedAmount);
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
            return Intrinsics.areEqual(this.position, args.position) && Intrinsics.areEqual(this.instrument, args.instrument) && Intrinsics.areEqual(this.quote, args.quote) && this.isDollarBasedAmount == args.isDollarBasedAmount;
        }

        public int hashCode() {
            int iHashCode = ((this.position.hashCode() * 31) + this.instrument.hashCode()) * 31;
            Quote quote = this.quote;
            return ((iHashCode + (quote == null ? 0 : quote.hashCode())) * 31) + Boolean.hashCode(this.isDollarBasedAmount);
        }

        public String toString() {
            return "Args(position=" + this.position + ", instrument=" + this.instrument + ", quote=" + this.quote + ", isDollarBasedAmount=" + this.isDollarBasedAmount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.position, flags);
            dest.writeParcelable(this.instrument, flags);
            dest.writeParcelable(this.quote, flags);
            dest.writeInt(this.isDollarBasedAmount ? 1 : 0);
        }

        public Args(Position position, Instrument instrument, Quote quote, boolean z) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.position = position;
            this.instrument = instrument;
            this.quote = quote;
            this.isDollarBasedAmount = z;
        }

        public /* synthetic */ Args(Position position, Instrument instrument, Quote quote, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(position, instrument, quote, (i & 8) != 0 ? false : z);
        }

        public final Position getPosition() {
            return this.position;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Quote getQuote() {
            return this.quote;
        }

        public final boolean isDollarBasedAmount() {
            return this.isDollarBasedAmount;
        }
    }

    /* compiled from: NotEnoughSharesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NotEnoughSharesDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Args getArgs(NotEnoughSharesDuxo notEnoughSharesDuxo) {
            return (Args) DuxoCompanion.DefaultImpls.getArgs(this, notEnoughSharesDuxo);
        }
    }
}
