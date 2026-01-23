package com.robinhood.shared.order.type.timeInForce;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: SelectTimeInForceDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0019\u0018B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDataState;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo$InitArgs;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceStateProvider;", "stateProvider", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceStateProvider;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/models/db/OrderTimeInForce;", "selectedTimeInForce", "", "onRowClick", "(Lcom/robinhood/models/db/OrderTimeInForce;)V", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "InitArgs", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SelectTimeInForceDuxo extends BaseDuxo<SelectTimeInForceDataState, SelectTimeInForceViewState> implements HasArgs<InitArgs> {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    public /* synthetic */ SelectTimeInForceDuxo(DuxoBundle duxoBundle, SelectTimeInForceDuxo2 selectTimeInForceDuxo2, Clock clock, SavedStateHandle savedStateHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(duxoBundle, (i & 2) != 0 ? new SelectTimeInForceDuxo2() : selectTimeInForceDuxo2, clock, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectTimeInForceDuxo(DuxoBundle duxoBundle, SelectTimeInForceDuxo2 stateProvider, Clock clock, SavedStateHandle savedStateHandle) {
        super(new SelectTimeInForceDataState(clock, ((InitArgs) INSTANCE.getArgs(savedStateHandle)).getInitialTimeInForce(), null, 4, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: SelectTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.order.type.timeInForce.SelectTimeInForceDuxo$onRowClick$1", m3645f = "SelectTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceDuxo$onRowClick$1 */
    static final class C393511 extends ContinuationImpl7 implements Function2<SelectTimeInForceDataState, Continuation<? super SelectTimeInForceDataState>, Object> {
        final /* synthetic */ OrderTimeInForce $selectedTimeInForce;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C393511(OrderTimeInForce orderTimeInForce, Continuation<? super C393511> continuation) {
            super(2, continuation);
            this.$selectedTimeInForce = orderTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C393511 c393511 = new C393511(this.$selectedTimeInForce, continuation);
            c393511.L$0 = obj;
            return c393511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectTimeInForceDataState selectTimeInForceDataState, Continuation<? super SelectTimeInForceDataState> continuation) {
            return ((C393511) create(selectTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SelectTimeInForceDataState.copy$default((SelectTimeInForceDataState) this.L$0, null, this.$selectedTimeInForce, null, 5, null);
        }
    }

    public final void onRowClick(OrderTimeInForce selectedTimeInForce) {
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        applyMutation(new C393511(selectedTimeInForce, null));
    }

    /* compiled from: SelectTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo$InitArgs;", "Landroid/os/Parcelable;", "initialTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;)V", "getInitialTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final OrderTimeInForce initialTimeInForce;

        /* compiled from: SelectTimeInForceDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((OrderTimeInForce) parcel.readParcelable(InitArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, OrderTimeInForce orderTimeInForce, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTimeInForce = initArgs.initialTimeInForce;
            }
            return initArgs.copy(orderTimeInForce);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTimeInForce getInitialTimeInForce() {
            return this.initialTimeInForce;
        }

        public final InitArgs copy(OrderTimeInForce initialTimeInForce) {
            Intrinsics.checkNotNullParameter(initialTimeInForce, "initialTimeInForce");
            return new InitArgs(initialTimeInForce);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && this.initialTimeInForce == ((InitArgs) other).initialTimeInForce;
        }

        public int hashCode() {
            return this.initialTimeInForce.hashCode();
        }

        public String toString() {
            return "InitArgs(initialTimeInForce=" + this.initialTimeInForce + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.initialTimeInForce, flags);
        }

        public InitArgs(OrderTimeInForce initialTimeInForce) {
            Intrinsics.checkNotNullParameter(initialTimeInForce, "initialTimeInForce");
            this.initialTimeInForce = initialTimeInForce;
        }

        public final OrderTimeInForce getInitialTimeInForce() {
            return this.initialTimeInForce;
        }
    }

    /* compiled from: SelectTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo;", "Lcom/robinhood/shared/order/type/timeInForce/SelectTimeInForceDuxo$InitArgs;", "<init>", "()V", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<SelectTimeInForceDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SelectTimeInForceDuxo selectTimeInForceDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, selectTimeInForceDuxo);
        }
    }
}
