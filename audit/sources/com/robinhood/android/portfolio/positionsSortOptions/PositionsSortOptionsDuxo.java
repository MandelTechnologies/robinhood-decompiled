package com.robinhood.android.portfolio.positionsSortOptions;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.portfolio.PositionsSortOptions;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import com.robinhood.android.models.portfolio.api.PositionsSortType;
import com.robinhood.android.portfolio.contracts.PositionsSortOptionsKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: PositionsSortOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDataState;", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "stateProvider", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onSortOptionSelected", "query", "", "onDone", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PositionsSortOptionsDuxo extends BaseDuxo<PositionsSortOptionsDataState, PositionsSortOptionsViewState> implements HasSavedState {
    private final PositionsV2Store positionsV2Store;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PositionsSortOptionsDuxo(PositionsV2Store positionsV2Store, PositionsSortOptionsStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new PositionsSortOptionsDataState(((PositionsSortOptionsKey) companion.getArgs(savedStateHandle)).getAccountNumber(), ((PositionsSortOptionsKey) companion.getArgs(savedStateHandle)).getPositionInstrumentType(), null, null, false, false, 60, null), stateProvider, duxoBundle);
        this.positionsV2Store = positionsV2Store;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: PositionsSortOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDuxo;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PositionsSortOptionsDuxo, PositionsSortOptionsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PositionsSortOptionsKey getArgs(SavedStateHandle savedStateHandle) {
            return (PositionsSortOptionsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PositionsSortOptionsKey getArgs(PositionsSortOptionsDuxo positionsSortOptionsDuxo) {
            return (PositionsSortOptionsKey) DuxoCompanion.DefaultImpls.getArgs(this, positionsSortOptionsDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        final boolean z = !((PositionsSortOptionsKey) companion.getArgs((HasSavedState) this)).getAllowedSortTypes().isEmpty();
        List<PositionsSortType> allowedSortTypes = ((PositionsSortOptionsKey) companion.getArgs((HasSavedState) this)).getAllowedSortTypes();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowedSortTypes, 10));
        Iterator<T> it = allowedSortTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((PositionsSortType) it.next()).getServerValue());
        }
        PositionsV2Store positionsV2Store = this.positionsV2Store;
        Companion companion2 = INSTANCE;
        Single<PositionsSortOptions> singleFirstOrError = positionsV2Store.streamSortOptions(((PositionsSortOptionsKey) companion2.getArgs((HasSavedState) this)).getAccountNumber(), ((PositionsSortOptionsKey) companion2.getArgs((HasSavedState) this)).getPositionInstrumentType()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsSortOptionsDuxo.onStart$lambda$2(this.f$0, z, arrayList, (PositionsSortOptions) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[LOOP:0: B:30:0x0089->B:32:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onStart$lambda$2(PositionsSortOptionsDuxo positionsSortOptionsDuxo, boolean z, List list, PositionsSortOptions positionsSortOptions) {
        String sortQuery;
        String str;
        PositionsSortOptionsKey.InitialSortPreference initialSortPreference = ((PositionsSortOptionsKey) INSTANCE.getArgs((HasSavedState) positionsSortOptionsDuxo)).getInitialSortPreference();
        PositionsSortOptionsKey.InitialSortPreference.Default r1 = PositionsSortOptionsKey.InitialSortPreference.Default.INSTANCE;
        PositionsSortDirection sortDirection = null;
        if (Intrinsics.areEqual(initialSortPreference, r1)) {
            sortQuery = positionsSortOptions.getCurrentSortQuery();
        } else if (!Intrinsics.areEqual(initialSortPreference, PositionsSortOptionsKey.InitialSortPreference.None.INSTANCE)) {
            if (!(initialSortPreference instanceof PositionsSortOptionsKey.InitialSortPreference.Override)) {
                throw new NoWhenBranchMatchedException();
            }
            sortQuery = ((PositionsSortOptionsKey.InitialSortPreference.Override) initialSortPreference).getSortPreference().getSortQuery();
        } else {
            str = null;
            if (!Intrinsics.areEqual(initialSortPreference, r1)) {
                sortDirection = positionsSortOptions.getCurrentSortDirection();
            } else if (!Intrinsics.areEqual(initialSortPreference, PositionsSortOptionsKey.InitialSortPreference.None.INSTANCE)) {
                if (!(initialSortPreference instanceof PositionsSortOptionsKey.InitialSortPreference.Override)) {
                    throw new NoWhenBranchMatchedException();
                }
                sortDirection = ((PositionsSortOptionsKey.InitialSortPreference.Override) initialSortPreference).getSortPreference().getSortDirection();
            }
            PositionsSortDirection positionsSortDirection = sortDirection;
            boolean z2 = z || CollectionsKt.contains(list, str);
            List<PositionsSortOptions.SortOption> options = positionsSortOptions.getOptions();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(options, 10)), 16));
            for (PositionsSortOptions.SortOption sortOption : options) {
                Tuples2 tuples2M3642to = Tuples4.m3642to(sortOption.getQuery(), sortOption.getTitle());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            positionsSortOptionsDuxo.applyMutation(new PositionsSortOptionsDuxo5(list, positionsSortOptions, str, positionsSortDirection, z2, linkedHashMap, z, null));
            return Unit.INSTANCE;
        }
        str = sortQuery;
        if (!Intrinsics.areEqual(initialSortPreference, r1)) {
        }
        PositionsSortDirection positionsSortDirection2 = sortDirection;
        boolean z22 = z || CollectionsKt.contains(list, str);
        List<PositionsSortOptions.SortOption> options2 = positionsSortOptions.getOptions();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(options2, 10)), 16));
        while (r0.hasNext()) {
        }
        positionsSortOptionsDuxo.applyMutation(new PositionsSortOptionsDuxo5(list, positionsSortOptions, str, positionsSortDirection2, z22, linkedHashMap2, z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: PositionsSortOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onSortOptionSelected$1", m3645f = "PositionsSortOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onSortOptionSelected$1 */
    static final class C258481 extends ContinuationImpl7 implements Function2<PositionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState>, Object> {
        final /* synthetic */ String $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C258481(String str, Continuation<? super C258481> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C258481 c258481 = new C258481(this.$query, continuation);
            c258481.L$0 = obj;
            return c258481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsSortOptionsDataState positionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState> continuation) {
            return ((C258481) create(positionsSortOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PositionsSortOptionsDataState positionsSortOptionsDataState = (PositionsSortOptionsDataState) this.L$0;
            return PositionsSortOptionsDataState.copy$default(positionsSortOptionsDataState, null, null, null, PositionsSortOptionsDuxo6.next(positionsSortOptionsDataState.getSortPreference(), this.$query), false, false, 55, null);
        }
    }

    public final void onSortOptionSelected(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        applyMutation(new C258481(query, null));
    }

    public final void onDone() {
        withDataState(new Function1() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsSortOptionsDuxo.onDone$lambda$3(this.f$0, (PositionsSortOptionsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDone$lambda$3(PositionsSortOptionsDuxo positionsSortOptionsDuxo, PositionsSortOptionsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (((PositionsSortOptionsKey) INSTANCE.getArgs((HasSavedState) positionsSortOptionsDuxo)).getPersistSort() && dataState.getSortOptions() != null) {
            positionsSortOptionsDuxo.applyMutation(new PositionsSortOptionsDuxo2(null));
            BuildersKt__Builders_commonKt.launch$default(positionsSortOptionsDuxo.getLifecycleScope(), null, null, new PositionsSortOptionsDuxo3(positionsSortOptionsDuxo, dataState, null), 3, null);
        } else {
            positionsSortOptionsDuxo.applyMutation(new PositionsSortOptionsDuxo4(null));
        }
        return Unit.INSTANCE;
    }
}
