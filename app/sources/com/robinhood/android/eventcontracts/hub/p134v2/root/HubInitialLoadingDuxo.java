package com.robinhood.android.eventcontracts.hub.p134v2.root;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.experiments.EventContractsSportsExperiment;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode4;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.store.event.EcHubNavTreeStore;
import com.robinhood.store.event.EcHubSessionTracker;
import com.robinhood.store.event.PartialTree;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HubInitialLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u001f B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J2\u0010\u0016\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/HubInitialLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/HubInitialLoadingViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/NavigateToCategoryContentEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/HubInitialLoadingDuxo$InitialArgs;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "hubSessionTracker", "Lcom/robinhood/store/event/EcHubSessionTracker;", "ecHubNavTreeStore", "Lcom/robinhood/store/event/EcHubNavTreeStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/store/event/EcHubSessionTracker;Lcom/robinhood/store/event/EcHubNavTreeStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "prefetchTree", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/predictionmarkets/SubCategorySelectionMode;", "nodeId", "isInitialCallToPreFetchTree", "", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InitialArgs", "Companion", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HubInitialLoadingDuxo extends BaseDuxo5<HubInitialLoadingDuxo2, NavigateToCategoryContentEvent> implements HasArgs<InitialArgs> {
    private final EcHubNavTreeStore ecHubNavTreeStore;
    private final ExperimentsProvider experimentsProvider;
    private final EcHubSessionTracker hubSessionTracker;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HubInitialLoadingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingDuxo", m3645f = "HubInitialLoadingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 91}, m3647m = "prefetchTree")
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingDuxo$prefetchTree$1 */
    static final class C165761 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C165761(Continuation<? super C165761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HubInitialLoadingDuxo.this.prefetchTree(null, false, this);
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public InitialArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitialArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubInitialLoadingDuxo(ExperimentsProvider experimentsProvider, EcHubSessionTracker hubSessionTracker, EcHubNavTreeStore ecHubNavTreeStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(HubInitialLoadingDuxo2.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(hubSessionTracker, "hubSessionTracker");
        Intrinsics.checkNotNullParameter(ecHubNavTreeStore, "ecHubNavTreeStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsProvider = experimentsProvider;
        this.hubSessionTracker = hubSessionTracker;
        this.ecHubNavTreeStore = ecHubNavTreeStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C165751(null));
    }

    /* compiled from: HubInitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingDuxo$onCreate$1", m3645f = "HubInitialLoadingDuxo.kt", m3646l = {41, 47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.HubInitialLoadingDuxo$onCreate$1 */
    static final class C165751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C165751(Continuation<? super C165751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HubInitialLoadingDuxo.this.new C165751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C165751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        
            if (r12 == r0) goto L19;
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
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(HubInitialLoadingDuxo.this.experimentsProvider, new Experiment[]{EventContractsSportsExperiment.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamStateFlow$default, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) obj;
                if (list != null) {
                    HubInitialLoadingDuxo.this.submit(new NavigateToCategoryContentEvent(list));
                } else {
                    HubInitialLoadingDuxo.this.submit(new NavigateToCategoryContentEvent(null));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                HubInitialLoadingDuxo.this.hubSessionTracker.trackHubSessionStart();
                HubInitialLoadingDuxo hubInitialLoadingDuxo = HubInitialLoadingDuxo.this;
                UUID initialNodeId = ((InitialArgs) hubInitialLoadingDuxo.getArgs(hubInitialLoadingDuxo.getSavedStateHandle())).getInitialNodeId();
                if (initialNodeId != null) {
                    HubInitialLoadingDuxo hubInitialLoadingDuxo2 = HubInitialLoadingDuxo.this;
                    this.label = 2;
                    obj = hubInitialLoadingDuxo2.prefetchTree(initialNodeId, true, this);
                } else {
                    HubInitialLoadingDuxo.this.submit(new NavigateToCategoryContentEvent(null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prefetchTree(UUID uuid, boolean z, Continuation<? super List<? extends Tuples2<UUID, ? extends EcHubNavNode4>>> continuation) {
        C165761 c165761;
        PartialTree partialTree;
        Object next;
        UUID uuid2;
        EcHubNavNode ecHubNavNode;
        List list;
        if (continuation instanceof C165761) {
            c165761 = (C165761) continuation;
            int i = c165761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c165761.label = i - Integer.MIN_VALUE;
            } else {
                c165761 = new C165761(continuation);
            }
        }
        Object objForceFetchPartialTreeByParentId = c165761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c165761.label;
        try {
        } catch (Exception unused) {
            partialTree = null;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetchPartialTreeByParentId);
            EcHubNavTreeStore ecHubNavTreeStore = this.ecHubNavTreeStore;
            c165761.L$0 = uuid;
            c165761.Z$0 = z;
            c165761.label = 1;
            objForceFetchPartialTreeByParentId = ecHubNavTreeStore.forceFetchPartialTreeByParentId(uuid, c165761);
            if (objForceFetchPartialTreeByParentId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ecHubNavNode = (EcHubNavNode) c165761.L$1;
                uuid2 = (UUID) c165761.L$0;
                ResultKt.throwOnFailure(objForceFetchPartialTreeByParentId);
                list = (List) objForceFetchPartialTreeByParentId;
                if (list != null) {
                    return null;
                }
                return CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOf(Tuples4.m3642to(uuid2, ecHubNavNode.getSubCategorySelectionMode())));
            }
            z = c165761.Z$0;
            uuid = (UUID) c165761.L$0;
            ResultKt.throwOnFailure(objForceFetchPartialTreeByParentId);
        }
        partialTree = (PartialTree) objForceFetchPartialTreeByParentId;
        if (partialTree == null) {
            return null;
        }
        Iterator<T> it = partialTree.getNodes().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((EcHubNavNode) next).getId(), partialTree.getTreeParentId())) {
                break;
            }
        }
        EcHubNavNode ecHubNavNode2 = (EcHubNavNode) next;
        if (ecHubNavNode2 == null) {
            return null;
        }
        if (ecHubNavNode2.getSubCategorySelectionMode() == EcHubNavNode4.PUSH) {
            if (z) {
                return CollectionsKt.listOf(Tuples4.m3642to(uuid, ecHubNavNode2.getSubCategorySelectionMode()));
            }
            return CollectionsKt.emptyList();
        }
        UUID parentId = ecHubNavNode2.getParentId();
        if (parentId != null) {
            c165761.L$0 = uuid;
            c165761.L$1 = ecHubNavNode2;
            c165761.label = 2;
            Object objPrefetchTree = prefetchTree(parentId, false, c165761);
            if (objPrefetchTree != coroutine_suspended) {
                uuid2 = uuid;
                ecHubNavNode = ecHubNavNode2;
                objForceFetchPartialTreeByParentId = objPrefetchTree;
                list = (List) objForceFetchPartialTreeByParentId;
                if (list != null) {
                }
            }
            return coroutine_suspended;
        }
        return CollectionsKt.listOf(Tuples4.m3642to(uuid, ecHubNavNode2.getSubCategorySelectionMode()));
    }

    /* compiled from: HubInitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/HubInitialLoadingDuxo$InitialArgs;", "Landroid/os/Parcelable;", "entryPointIdentifier", "", "initialNodeId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getEntryPointIdentifier", "()Ljava/lang/String;", "getInitialNodeId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitialArgs> CREATOR = new Creator();
        private final String entryPointIdentifier;
        private final UUID initialNodeId;

        /* compiled from: HubInitialLoadingDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitialArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitialArgs(parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs[] newArray(int i) {
                return new InitialArgs[i];
            }
        }

        public static /* synthetic */ InitialArgs copy$default(InitialArgs initialArgs, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initialArgs.entryPointIdentifier;
            }
            if ((i & 2) != 0) {
                uuid = initialArgs.initialNodeId;
            }
            return initialArgs.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInitialNodeId() {
            return this.initialNodeId;
        }

        public final InitialArgs copy(String entryPointIdentifier, UUID initialNodeId) {
            Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
            return new InitialArgs(entryPointIdentifier, initialNodeId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitialArgs)) {
                return false;
            }
            InitialArgs initialArgs = (InitialArgs) other;
            return Intrinsics.areEqual(this.entryPointIdentifier, initialArgs.entryPointIdentifier) && Intrinsics.areEqual(this.initialNodeId, initialArgs.initialNodeId);
        }

        public int hashCode() {
            int iHashCode = this.entryPointIdentifier.hashCode() * 31;
            UUID uuid = this.initialNodeId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "InitialArgs(entryPointIdentifier=" + this.entryPointIdentifier + ", initialNodeId=" + this.initialNodeId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entryPointIdentifier);
            dest.writeSerializable(this.initialNodeId);
        }

        public InitialArgs(String entryPointIdentifier, UUID uuid) {
            Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
            this.entryPointIdentifier = entryPointIdentifier;
            this.initialNodeId = uuid;
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final UUID getInitialNodeId() {
            return this.initialNodeId;
        }
    }

    /* compiled from: HubInitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/HubInitialLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/HubInitialLoadingDuxo;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/HubInitialLoadingDuxo$InitialArgs;", "<init>", "()V", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<HubInitialLoadingDuxo, InitialArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitialArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitialArgs getArgs(HubInitialLoadingDuxo hubInitialLoadingDuxo) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, hubInitialLoadingDuxo);
        }
    }
}
