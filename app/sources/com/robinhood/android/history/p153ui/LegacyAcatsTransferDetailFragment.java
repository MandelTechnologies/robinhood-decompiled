package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.extensions.AcatsTransfers2;
import com.robinhood.android.history.p153ui.LegacyAcatsTransferDetailFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore;
import com.robinhood.models.acats.p299db.LegacyAcatsTransfer;
import com.robinhood.models.acats.p299db.LegacyAcatsTransferPosition;
import com.robinhood.models.api.LegacyApiAcatsTransfer;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.Disposable4;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: LegacyAcatsTransferDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lkotlin/properties/ReadOnlyProperty;", LegacyAcatsTransferDetailFragment.ARG_ACATS_TRANSFER_ID, "Ljava/util/UUID;", "getAcatsTransferId", "()Ljava/util/UUID;", "acatsTransferId$delegate", "Lkotlin/Lazy;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "getAcatsTransferStore", "()Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "setAcatsTransferStore", "(Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;)V", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshUi", "acatsTransfer", "Lcom/robinhood/models/acats/db/LegacyAcatsTransfer;", "Adapter", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyAcatsTransferDetailFragment extends BaseDetailFragment {
    private static final String ARG_ACATS_TRANSFER_ID = "acatsTransferId";
    private static final int VIEW_TYPE_ACTION = 5;
    private static final int VIEW_TYPE_CANCEL = 6;
    private static final int VIEW_TYPE_OVERVIEW = 0;
    private static final int VIEW_TYPE_RECLAIM_FOOTER = 4;
    private static final int VIEW_TYPE_TRANSFERRED_CASH = 2;
    private static final int VIEW_TYPE_TRANSFERRED_HEADER = 1;
    private static final int VIEW_TYPE_TRANSFERRED_POSITION = 3;

    /* renamed from: acatsTransferId$delegate, reason: from kotlin metadata */
    private final Lazy acatsTransferId;
    public LegacyAcatsTransferStore acatsTransferStore;
    public InstrumentStore instrumentStore;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyAcatsTransferDetailFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LegacyAcatsTransferDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyApiAcatsTransfer.Type.values().length];
            try {
                iArr[LegacyApiAcatsTransfer.Type.RESIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.Type.RECLAIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.Type.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.Type.PARTIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LegacyAcatsTransferDetailFragment() {
        super(C18359R.layout.fragment_acats_transfer_detail);
        this.recyclerView = bindView(C18359R.id.recycler_view);
        this.acatsTransferId = Fragments2.argument(this, ARG_ACATS_TRANSFER_ID);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getAcatsTransferId() {
        return (UUID) this.acatsTransferId.getValue();
    }

    public final LegacyAcatsTransferStore getAcatsTransferStore() {
        LegacyAcatsTransferStore legacyAcatsTransferStore = this.acatsTransferStore;
        if (legacyAcatsTransferStore != null) {
            return legacyAcatsTransferStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("acatsTransferStore");
        return null;
    }

    public final void setAcatsTransferStore(LegacyAcatsTransferStore legacyAcatsTransferStore) {
        Intrinsics.checkNotNullParameter(legacyAcatsTransferStore, "<set-?>");
        this.acatsTransferStore = legacyAcatsTransferStore;
    }

    public final InstrumentStore getInstrumentStore() {
        InstrumentStore instrumentStore = this.instrumentStore;
        if (instrumentStore != null) {
            return instrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentStore");
        return null;
    }

    public final void setInstrumentStore(InstrumentStore instrumentStore) {
        Intrinsics.checkNotNullParameter(instrumentStore, "<set-?>");
        this.instrumentStore = instrumentStore;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = getAcatsTransferId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getExpandedToolbarSubtitleTxt().setText(C18359R.string.acats_transfer_detail_subtitle);
        getExpandedToolbarSubtitleTxt().setVisibility(0);
        getRecyclerView().setHasFixedSize(true);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getActivity()));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C183911(null), 3, null);
    }

    /* compiled from: LegacyAcatsTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$onViewCreated$1", m3645f = "LegacyAcatsTransferDetailFragment.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$onViewCreated$1 */
    static final class C183911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C183911(Continuation<? super C183911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyAcatsTransferDetailFragment.this.new C183911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C183911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LegacyAcatsTransferDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$onViewCreated$1$1", m3645f = "LegacyAcatsTransferDetailFragment.kt", m3646l = {76}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LegacyAcatsTransferDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = legacyAcatsTransferDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getAcatsTransferStore().refresh(false);
                    Flow<LegacyAcatsTransfer> acatsTransfer = this.this$0.getAcatsTransferStore().getAcatsTransfer(this.this$0.getAcatsTransferId());
                    C501761 c501761 = new C501761(this.this$0);
                    this.label = 1;
                    if (acatsTransfer.collect(c501761, this) == coroutine_suspended) {
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

            /* compiled from: LegacyAcatsTransferDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C501761 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ LegacyAcatsTransferDetailFragment $tmp0;

                C501761(LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment) {
                    this.$tmp0 = legacyAcatsTransferDetailFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, LegacyAcatsTransferDetailFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/models/acats/db/LegacyAcatsTransfer;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(LegacyAcatsTransfer legacyAcatsTransfer, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$refreshUi = AnonymousClass1.invokeSuspend$refreshUi(this.$tmp0, legacyAcatsTransfer, continuation);
                    return objInvokeSuspend$refreshUi == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$refreshUi : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((LegacyAcatsTransfer) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$refreshUi(LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment, LegacyAcatsTransfer legacyAcatsTransfer, Continuation continuation) {
                legacyAcatsTransferDetailFragment.refreshUi(legacyAcatsTransfer);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = LegacyAcatsTransferDetailFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LegacyAcatsTransferDetailFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(LegacyAcatsTransfer acatsTransfer) {
        String string2;
        TextView expandedToolbarTitleTxt = getExpandedToolbarTitleTxt();
        int i = WhenMappings.$EnumSwitchMapping$0[acatsTransfer.getType().ordinal()];
        if (i == 1) {
            string2 = getString(C18359R.string.acats_transfer_detail_title_residual, acatsTransfer.getContraBrokerageName());
        } else if (i == 2) {
            string2 = getString(C18359R.string.acats_transfer_detail_title_reclaim, acatsTransfer.getContraBrokerageName());
        } else {
            if (i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = getString(C18359R.string.acats_transfer_detail_title, acatsTransfer.getContraBrokerageName());
        }
        expandedToolbarTitleTxt.setText(string2);
        getRecyclerView().setAdapter(new Adapter(this, acatsTransfer));
    }

    /* compiled from: LegacyAcatsTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "acatsTransfer", "Lcom/robinhood/models/acats/db/LegacyAcatsTransfer;", "<init>", "(Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment;Lcom/robinhood/models/acats/db/LegacyAcatsTransfer;)V", "items", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getItemCount", "", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "bindOverview", "view", "Landroid/view/View;", "bindTransferredHeader", "bindTransferredCash", "bindPosition", "Lcom/robinhood/models/acats/db/LegacyAcatsTransferPosition;", "bindReclaimedFooter", "bindAction", "bindCancel", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public final class Adapter extends RecyclerView.Adapter<SimpleViewHolder> {
        private final LegacyAcatsTransfer acatsTransfer;
        private ArrayList<Object> items;
        final /* synthetic */ LegacyAcatsTransferDetailFragment this$0;

        /* compiled from: LegacyAcatsTransferDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LegacyApiAcatsTransfer.State.values().length];
                try {
                    iArr[LegacyApiAcatsTransfer.State.NEW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LegacyApiAcatsTransfer.State.REQUEST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LegacyApiAcatsTransfer.State.REVIEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LegacyApiAcatsTransfer.State.FINALIZING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LegacyApiAcatsTransfer.State.COMPLETED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[LegacyApiAcatsTransfer.State.FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[LegacyApiAcatsTransfer.State.CANCELED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Adapter(LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment, LegacyAcatsTransfer acatsTransfer) {
            Intrinsics.checkNotNullParameter(acatsTransfer, "acatsTransfer");
            this.this$0 = legacyAcatsTransferDetailFragment;
            this.acatsTransfer = acatsTransfer;
            ArrayList<Object> arrayList = new ArrayList<>();
            this.items = arrayList;
            arrayList.clear();
            this.items.add(0);
            if (AcatsTransfers2.shouldShowAssets(acatsTransfer)) {
                this.items.add(1);
                if (BigDecimals7.isPositive(acatsTransfer.getCashValue())) {
                    this.items.add(2);
                }
                CollectionsKt.toCollection(acatsTransfer.getPositions(), this.items);
            }
            if (acatsTransfer.getType() == LegacyApiAcatsTransfer.Type.RECLAIM) {
                this.items.add(4);
            }
            if (acatsTransfer.isCancelable()) {
                this.items.add(6);
            } else {
                this.items.add(5);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: getItemCount */
        public int getSize() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            Object obj = this.items.get(position);
            if (obj instanceof LegacyAcatsTransferPosition) {
                return 3;
            }
            if (!(obj instanceof Integer)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.items.get(position));
                throw new ExceptionsH();
            }
            Object obj2 = this.items.get(position);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj2).intValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            int i;
            Intrinsics.checkNotNullParameter(parent, "parent");
            switch (viewType) {
                case 0:
                    i = C18359R.layout.include_acats_transfer_detail_overview;
                    break;
                case 1:
                    i = C18359R.layout.include_acats_transfer_detail_transferred_header;
                    break;
                case 2:
                case 3:
                    i = C18359R.layout.include_acats_transfer_detail_transferred_row;
                    break;
                case 4:
                    i = C18359R.layout.include_acats_transfer_detail_reclaim_footer;
                    break;
                case 5:
                    i = C18359R.layout.include_acats_transfer_detail_action;
                    break;
                case 6:
                    i = C18359R.layout.include_acats_transfer_detail_cancel;
                    break;
                default:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                    throw new ExceptionsH();
            }
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(i, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SimpleViewHolder(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SimpleViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            switch (getItemViewType(position)) {
                case 0:
                    View itemView = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    bindOverview(itemView);
                    return;
                case 1:
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    bindTransferredHeader(itemView2);
                    return;
                case 2:
                    View itemView3 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    bindTransferredCash(itemView3);
                    return;
                case 3:
                    View itemView4 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    Object obj = this.items.get(position);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.models.acats.db.LegacyAcatsTransferPosition");
                    bindPosition(itemView4, (LegacyAcatsTransferPosition) obj);
                    return;
                case 4:
                    View itemView5 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
                    bindReclaimedFooter(itemView5);
                    return;
                case 5:
                    View itemView6 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView6, "itemView");
                    bindAction(itemView6);
                    return;
                case 6:
                    View itemView7 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView7, "itemView");
                    bindCancel(itemView7);
                    return;
                default:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(getItemViewType(position)));
                    throw new ExceptionsH();
            }
        }

        private final void bindOverview(View view) {
            Resources resources = this.this$0.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ((RdsDataRowView) view.findViewById(C18359R.id.acats_transfer_detail_status)).setValueText(AcatsTransfers2.getStatusLabel(this.acatsTransfer, resources));
            ((RdsDataRowView) view.findViewById(C18359R.id.acats_transfer_detail_broker)).setValueText(this.acatsTransfer.getContraBrokerageName());
            ((RdsDataRowView) view.findViewById(C18359R.id.acats_transfer_detail_account_number)).setValueText(this.acatsTransfer.getContraAccountNumber());
            switch (WhenMappings.$EnumSwitchMapping$0[this.acatsTransfer.getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    RdsDataRowView rdsDataRowView = (RdsDataRowView) view.findViewById(C18359R.id.acats_transfer_detail_eta);
                    rdsDataRowView.setValueText(LocalDateFormatter.MEDIUM.format((LocalDateFormatter) this.acatsTransfer.getExpectedLandingDate()));
                    Intrinsics.checkNotNull(rdsDataRowView);
                    rdsDataRowView.setVisibility(0);
                    return;
                case 5:
                    RdsDataRowView rdsDataRowView2 = (RdsDataRowView) view.findViewById(C18359R.id.acats_transfer_detail_arrival_date);
                    rdsDataRowView2.setValueText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) this.acatsTransfer.getUpdatedAt()));
                    Intrinsics.checkNotNull(rdsDataRowView2);
                    rdsDataRowView2.setVisibility(0);
                    if (BigDecimals7.isPositive(this.acatsTransfer.getFeesReimbursed())) {
                        RdsDataRowView rdsDataRowView3 = (RdsDataRowView) view.findViewById(C18359R.id.acats_transfer_detail_fees_reimbursed);
                        rdsDataRowView3.setValueText(Formats.getCurrencyFormat().format(this.acatsTransfer.getFeesReimbursed()));
                        Intrinsics.checkNotNull(rdsDataRowView3);
                        rdsDataRowView3.setVisibility(0);
                        return;
                    }
                    return;
                case 6:
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) view.findViewById(C18359R.id.acats_transfer_detail_failure);
                    rdsDataRowView4.setValueText(this.acatsTransfer.getFailureReason());
                    Intrinsics.checkNotNull(rdsDataRowView4);
                    rdsDataRowView4.setVisibility(0);
                    return;
                case 7:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final void bindTransferredHeader(View view) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            LegacyAcatsTransfer legacyAcatsTransfer = this.acatsTransfer;
            Resources resources = this.this$0.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ((TextView) view).setText(AcatsTransfers2.getAssetsHeader(legacyAcatsTransfer, resources));
        }

        private final void bindTransferredCash(View view) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsDataRowView");
            RdsDataRowView rdsDataRowView = (RdsDataRowView) view;
            rdsDataRowView.setLabelText(this.this$0.getString(C18359R.string.acats_transfer_detail_transferred_cash_label));
            rdsDataRowView.setValueText(Formats.getCurrencyFormat().format(this.acatsTransfer.getCashValue()));
        }

        private final void bindPosition(View view, LegacyAcatsTransferPosition position) {
            if (view.getTag() != null) {
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.reactivex.disposables.Disposable");
                Disposable4.disposeSafe((Disposable) tag);
            }
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsDataRowView");
            final RdsDataRowView rdsDataRowView = (RdsDataRowView) view;
            BigDecimal quantity = position.getQuantity();
            if (this.acatsTransfer.getIsPending()) {
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                rdsDataRowView.setValueText(com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(resources, C11048R.plurals.general_number_of_shares, quantity, Formats.getShareQuantityFormat().format(quantity)));
            } else {
                Resources resources2 = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                rdsDataRowView.setValueText(com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(resources2, C11048R.plurals.general_number_of_shares_with_price, quantity, Formats.getShareQuantityFormat().format(quantity), Formats.getCurrencyFormat().format(position.getPrice())));
            }
            UUID instrument = position.getInstrument();
            if (instrument != null) {
                LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment = this.this$0;
                rdsDataRowView.setTag(LifecycleHost.DefaultImpls.bind$default(legacyAcatsTransferDetailFragment, ObservablesAndroid.observeOnMainThread(legacyAcatsTransferDetailFragment.getInstrumentStore().getInstrument(instrument)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$Adapter$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LegacyAcatsTransferDetailFragment.Adapter.bindPosition$lambda$0(rdsDataRowView, (Instrument) obj);
                    }
                }));
            } else {
                rdsDataRowView.setLabelText(this.this$0.getResources().getString(C41827R.string.general_label_n_a));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindPosition$lambda$0(RdsDataRowView rdsDataRowView, Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            rdsDataRowView.setLabelText(it.getSymbol());
            return Unit.INSTANCE;
        }

        private final void bindReclaimedFooter(View view) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(this.this$0.getString(C18359R.string.acats_transfer_detail_reclaim_footer, this.acatsTransfer.getContraBrokerageName()));
        }

        private final void bindAction(View view) {
            Button button = (Button) view.findViewById(C18359R.id.acats_transfer_detail_action_btn);
            switch (WhenMappings.$EnumSwitchMapping$0[this.acatsTransfer.getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    button.setText(this.this$0.getString(C11048R.string.general_action_learn_more));
                    final LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment = this.this$0;
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$Adapter$bindAction$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            WebUtils.viewUrl$default(legacyAcatsTransferDetailFragment.getActivity(), legacyAcatsTransferDetailFragment.getString(C11048R.string.url_acats_faq), 0, 4, (Object) null);
                        }
                    });
                    return;
                case 6:
                case 7:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final void bindCancel(View view) {
            View viewFindViewById = view.findViewById(C18359R.id.acats_transfer_detail_cancel_btn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            final LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment = this.this$0;
            OnClickListeners.onClickView(viewFindViewById, new Function1() { // from class: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$Adapter$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LegacyAcatsTransferDetailFragment.Adapter.bindCancel$lambda$2(legacyAcatsTransferDetailFragment, (View) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindCancel$lambda$2(LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment, final View button) {
            Intrinsics.checkNotNullParameter(button, "button");
            final BaseActivity baseActivity = legacyAcatsTransferDetailFragment.getBaseActivity();
            Intrinsics.checkNotNull(baseActivity);
            button.setEnabled(false);
            Observable observableDoOnTerminate = ObservablesAndroid.observeOnMainThread(ObservableDelay2.minTimeInFlight$default(legacyAcatsTransferDetailFragment.getAcatsTransferStore().cancelAcatsTransferAndPoll(legacyAcatsTransferDetailFragment.getAcatsTransferId()), 1000L, null, 2, null)).onErrorResumeNext(legacyAcatsTransferDetailFragment.getActivityErrorHandler()).doOnTerminate(new Action() { // from class: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$Adapter$bindCancel$1$1
                @Override // io.reactivex.functions.Action
                public final void run() {
                    button.setEnabled(true);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableDoOnTerminate, "doOnTerminate(...)");
            LifecycleHost.DefaultImpls.bind$default(legacyAcatsTransferDetailFragment, observableDoOnTerminate, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.LegacyAcatsTransferDetailFragment$Adapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LegacyAcatsTransferDetailFragment.Adapter.bindCancel$lambda$2$lambda$1(baseActivity, (Optional) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindCancel$lambda$2$lambda$1(BaseActivity baseActivity, Optional optional) {
            int i;
            LegacyAcatsTransfer legacyAcatsTransfer = (LegacyAcatsTransfer) optional.component1();
            if (legacyAcatsTransfer != null && legacyAcatsTransfer.isCanceled()) {
                i = C18359R.string.acats_transfer_detail_cancel_success;
            } else {
                i = C18359R.string.acats_transfer_detail_cancel_failed;
            }
            Toast.makeText(baseActivity, i, 1).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LegacyAcatsTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment$Companion;", "", "<init>", "()V", "ARG_ACATS_TRANSFER_ID", "", "VIEW_TYPE_OVERVIEW", "", "VIEW_TYPE_TRANSFERRED_HEADER", "VIEW_TYPE_TRANSFERRED_CASH", "VIEW_TYPE_TRANSFERRED_POSITION", "VIEW_TYPE_RECLAIM_FOOTER", "VIEW_TYPE_ACTION", "VIEW_TYPE_CANCEL", "newInstance", "Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment;", LegacyAcatsTransferDetailFragment.ARG_ACATS_TRANSFER_ID, "Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LegacyAcatsTransferDetailFragment newInstance(UUID acatsTransferId) {
            Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
            LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment = new LegacyAcatsTransferDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(LegacyAcatsTransferDetailFragment.ARG_ACATS_TRANSFER_ID, acatsTransferId);
            legacyAcatsTransferDetailFragment.setArguments(bundle);
            return legacyAcatsTransferDetailFragment;
        }
    }
}
