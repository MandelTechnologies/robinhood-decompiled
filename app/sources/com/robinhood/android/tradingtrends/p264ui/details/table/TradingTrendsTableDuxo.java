package com.robinhood.android.tradingtrends.p264ui.details.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsMicrogramSduiConverters;
import com.robinhood.android.tradingtrends.p264ui.details.table.TradingTrendsGenericCell;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.libtradingtrends.contracts.TableColumn;
import com.robinhood.libtradingtrends.contracts.TableColumnAlignment;
import com.robinhood.libtradingtrends.contracts.TableHeader;
import com.robinhood.libtradingtrends.contracts.TableHeaderSortAction;
import com.robinhood.libtradingtrends.contracts.TableRow;
import com.robinhood.libtradingtrends.contracts.TradingTrendsTable;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.ScreenerAction;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import com.robinhood.models.serverdriven.experimental.api.TableSortAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import microgram.p507ui.sdui.SduiIcon;

/* compiled from: TradingTrendsTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002./B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001d\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0%0$2\u0006\u0010!\u001a\u00020\"H\u0002J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010!\u001a\u00020\"H\u0002J\f\u0010(\u001a\u00020)*\u00020*H\u0002J\u0016\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDataState;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo$InitArgs;", "sduiConverters", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;", "tradingTrendsService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "tradingTrendsTableStateProvider", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "tradingTrendsTypeState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsType;", "sortJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "setTradingTrendsType", "tradingTrendsType", "buildGenericTableDataV2", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell;", "table", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "mapRowsToGenericTableRowsV2", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/generic/table/GenericRow;", "mapColumnsToGenericHeaderRowV2", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell$Sdui;", "toBoxAlignment", "Landroidx/compose/ui/Alignment;", "Lcom/robinhood/libtradingtrends/contracts/TableColumnAlignment;", "sortTableBy", "sortBy", "sortDirection", "InitArgs", "Companion", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TradingTrendsTableDuxo extends BaseDuxo<TradingTrendsTableDataState, TradingTrendsTableViewState> implements HasArgs<InitArgs> {
    private final SavedStateHandle savedStateHandle;
    private final TradingTrendsMicrogramSduiConverters sduiConverters;
    private Job sortJob;
    private final TradingTrendsCachedService tradingTrendsService;
    private final StateFlow2<String> tradingTrendsTypeState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TradingTrendsTableDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TableColumnAlignment.values().length];
            try {
                iArr[TableColumnAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TableColumnAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TableColumnAlignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingTrendsTableDuxo(TradingTrendsMicrogramSduiConverters sduiConverters, TradingTrendsCachedService tradingTrendsService, SavedStateHandle savedStateHandle, TradingTrendsTableStateProvider tradingTrendsTableStateProvider, DuxoBundle duxoBundle) {
        super(new TradingTrendsTableDataState(((InitArgs) INSTANCE.getArgs(savedStateHandle)).getInstrumentId(), null, null, 6, null), tradingTrendsTableStateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
        Intrinsics.checkNotNullParameter(tradingTrendsService, "tradingTrendsService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(tradingTrendsTableStateProvider, "tradingTrendsTableStateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sduiConverters = sduiConverters;
        this.tradingTrendsService = tradingTrendsService;
        this.savedStateHandle = savedStateHandle;
        this.tradingTrendsTypeState = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: TradingTrendsTableDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo$InitArgs;", "Landroid/os/Parcelable;", "instrumentId", "", "<init>", "(Ljava/lang/String;)V", "getInstrumentId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String instrumentId;

        /* compiled from: TradingTrendsTableDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initArgs.instrumentId;
            }
            return initArgs.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final InitArgs copy(String instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new InitArgs(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.instrumentId, ((InitArgs) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "InitArgs(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.instrumentId);
        }

        public InitArgs(String instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: TradingTrendsTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDuxo$InitArgs;", "<init>", "()V", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<TradingTrendsTableDuxo, InitArgs> {
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
        public InitArgs getArgs(TradingTrendsTableDuxo tradingTrendsTableDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, tradingTrendsTableDuxo);
        }
    }

    /* compiled from: TradingTrendsTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableDuxo$onCreate$1", m3645f = "TradingTrendsTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableDuxo$onCreate$1 */
    static final class C300131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C300131(Continuation<? super C300131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradingTrendsTableDuxo.this.new C300131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(TradingTrendsTableDuxo.this.tradingTrendsTypeState, new C30012x978d2491(null, TradingTrendsTableDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(TradingTrendsTableDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: TradingTrendsTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lkotlin/Result;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableDuxo$onCreate$1$2", m3645f = "TradingTrendsTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends TradingTrendsTable>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TradingTrendsTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TradingTrendsTableDuxo tradingTrendsTableDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = tradingTrendsTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends TradingTrendsTable> result, Continuation<? super Unit> continuation) {
                return invoke(result.getValue(), continuation);
            }

            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Result.m28549boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object value = ((Result) this.L$0).getValue();
                TradingTrendsTableDuxo tradingTrendsTableDuxo = this.this$0;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                if (thM28553exceptionOrNullimpl == null) {
                    tradingTrendsTableDuxo.applyMutation(new TradingTrendsTableDuxo2(tradingTrendsTableDuxo, (TradingTrendsTable) value, null));
                } else {
                    Logger.INSTANCE.mo1682e(thM28553exceptionOrNullimpl, "Failed to get table", new Object[0]);
                    tradingTrendsTableDuxo.applyMutation(new TradingTrendsTableDuxo3(null));
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C300131(null));
    }

    public final void setTradingTrendsType(String tradingTrendsType) {
        StateFlow2<String> stateFlow2 = this.tradingTrendsTypeState;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), tradingTrendsType)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GenericTableData<TradingTrendsGenericCell> buildGenericTableDataV2(TradingTrendsTable table) {
        return new GenericTableData<>(mapColumnsToGenericHeaderRowV2(table), mapRowsToGenericTableRowsV2(table));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCell$Sdui] */
    private final ImmutableList3<GenericRow<TradingTrendsGenericCell>> mapRowsToGenericTableRowsV2(TradingTrendsTable table) {
        List<TableRow> rows = table.getRows();
        List listEmptyList = CollectionsKt.emptyList();
        int i = 0;
        for (Object obj : rows) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TableRow tableRow = (TableRow) obj;
            List list = listEmptyList;
            String str = i + "-" + tableRow.hashCode();
            List<TableColumn> columns = table.getColumns();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object obj2 : columns) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TableColumn tableColumn = (TableColumn) obj2;
                UIComponent<?> uIComponentConvertUiComponent = this.sduiConverters.convertUiComponent(tableRow.getItems().get(i3).getComponent());
                if (uIComponentConvertUiComponent != null) {
                    sdui = new TradingTrendsGenericCell.Sdui(i, uIComponentConvertUiComponent, toBoxAlignment(tableColumn.getAlignment()), tableColumn.getWidth() != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r6.intValue())) : null, null);
                }
                if (sdui != null) {
                    arrayList.add(sdui);
                }
                i3 = i4;
            }
            listEmptyList = CollectionsKt.plus((Collection<? extends GenericRow>) list, new GenericRow(str, arrayList, false, null, null, 28, null));
            i = i2;
        }
        return extensions2.toPersistentList(listEmptyList);
    }

    private final ImmutableList3<TradingTrendsGenericCell.Sdui> mapColumnsToGenericHeaderRowV2(TradingTrendsTable table) {
        List<TableColumn> columns = table.getColumns();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(columns, 10));
        int i = 0;
        for (Object obj : columns) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TableColumn tableColumn = (TableColumn) obj;
            TableHeader headerItem = tableColumn.getHeaderItem();
            String title = headerItem.getTitle();
            SduiIcon icon = headerItem.getIcon();
            C2002Dp c2002DpM7993boximpl = null;
            Icon iconFromServerValue = icon != null ? Icon.INSTANCE.fromServerValue(icon.getValue()) : null;
            boolean active = headerItem.getActive();
            TableHeaderSortAction action = headerItem.getAction();
            TableColumnHeader tableColumnHeader = new TableColumnHeader(title, iconFromServerValue, null, active, action != null ? new ScreenerAction.TableSort(new TableSortAction(action.getKey(), action.getDirection())) : null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
            Alignment boxAlignment = toBoxAlignment(tableColumn.getAlignment());
            if (tableColumn.getWidth() != null) {
                c2002DpM7993boximpl = C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r2.intValue()));
            }
            arrayList.add(new TradingTrendsGenericCell.Sdui(0, tableColumnHeader, boxAlignment, c2002DpM7993boximpl, null));
            i = i2;
        }
        return extensions2.toPersistentList(arrayList);
    }

    private final Alignment toBoxAlignment(TableColumnAlignment tableColumnAlignment) {
        int i = WhenMappings.$EnumSwitchMapping$0[tableColumnAlignment.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenter();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getCenterEnd();
    }

    /* compiled from: TradingTrendsTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableDuxo$sortTableBy$1", m3645f = "TradingTrendsTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableDuxo$sortTableBy$1 */
    static final class C300141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sortBy;
        final /* synthetic */ String $sortDirection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C300141(String str, String str2, Continuation<? super C300141> continuation) {
            super(2, continuation);
            this.$sortBy = str;
            this.$sortDirection = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradingTrendsTableDuxo.this.new C300141(this.$sortBy, this.$sortDirection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(50, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TradingTrendsCachedService tradingTrendsCachedService = TradingTrendsTableDuxo.this.tradingTrendsService;
                String str = this.$sortBy;
                String str2 = this.$sortDirection;
                this.label = 1;
                if (tradingTrendsCachedService.sortTable(str, str2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
        }
    }

    public final void sortTableBy(String sortBy, String sortDirection) {
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
        Job job = this.sortJob;
        if (job == null || !job.isActive()) {
            this.sortJob = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C300141(sortBy, sortDirection, null), 3, null);
        }
    }
}
