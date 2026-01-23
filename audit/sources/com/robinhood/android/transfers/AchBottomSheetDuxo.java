package com.robinhood.android.transfers;

import com.robinhood.android.transfers.LinkEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.models.p320db.AchRelationship;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AchBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/AchBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/AchBottomSheetViewState;", "Lcom/robinhood/android/transfers/LinkEvent;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "unlink", "", "relationship", "Lcom/robinhood/models/db/AchRelationship;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AchBottomSheetDuxo extends BaseDuxo5<AchBottomSheetViewState, LinkEvent> {
    public static final int $stable = 8;
    private final AchRelationshipStore achRelationshipStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchBottomSheetDuxo(AchRelationshipStore achRelationshipStore, DuxoBundle duxoBundle) {
        super(new AchBottomSheetViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.achRelationshipStore = achRelationshipStore;
    }

    /* compiled from: AchBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.AchBottomSheetDuxo$unlink$1", m3645f = "AchBottomSheetDuxo.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.AchBottomSheetDuxo$unlink$1 */
    static final class C300421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AchRelationship $relationship;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C300421(AchRelationship achRelationship, Continuation<? super C300421> continuation) {
            super(2, continuation);
            this.$relationship = achRelationship;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AchBottomSheetDuxo.this.new C300421(this.$relationship, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AchBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/AchBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.AchBottomSheetDuxo$unlink$1$1", m3645f = "AchBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.AchBottomSheetDuxo$unlink$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AchBottomSheetViewState, Continuation<? super AchBottomSheetViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AchBottomSheetViewState achBottomSheetViewState, Continuation<? super AchBottomSheetViewState> continuation) {
                return ((AnonymousClass1) create(achBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((AchBottomSheetViewState) this.L$0).copy(true);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AchBottomSheetDuxo achBottomSheetDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AchBottomSheetDuxo.this.applyMutation(new AnonymousClass1(null));
                        AchRelationshipStore achRelationshipStore = AchBottomSheetDuxo.this.achRelationshipStore;
                        UUID id = this.$relationship.getId();
                        this.label = 1;
                        if (achRelationshipStore.unlinkAchRelationship(id, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    AchBottomSheetDuxo.this.submit(LinkEvent.Unlink.Success.INSTANCE);
                    achBottomSheetDuxo = AchBottomSheetDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                } catch (Exception e) {
                    AchBottomSheetDuxo.this.submit(new LinkEvent.Unlink.Failed(e));
                    achBottomSheetDuxo = AchBottomSheetDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                }
                achBottomSheetDuxo.applyMutation(anonymousClass2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                AchBottomSheetDuxo.this.applyMutation(new AnonymousClass2(null));
                throw th;
            }
        }

        /* compiled from: AchBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/AchBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.AchBottomSheetDuxo$unlink$1$2", m3645f = "AchBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.AchBottomSheetDuxo$unlink$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AchBottomSheetViewState, Continuation<? super AchBottomSheetViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AchBottomSheetViewState achBottomSheetViewState, Continuation<? super AchBottomSheetViewState> continuation) {
                return ((AnonymousClass2) create(achBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((AchBottomSheetViewState) this.L$0).copy(false);
            }
        }
    }

    public final void unlink(AchRelationship relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C300421(relationship, null), 3, null);
    }
}
