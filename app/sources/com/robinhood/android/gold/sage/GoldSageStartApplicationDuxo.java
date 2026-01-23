package com.robinhood.android.gold.sage;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.gold.sage.GoldSageStartApplicationEvent;
import com.robinhood.android.gold.sage.data.GoldSageDestinationArgs;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import gold.proto.p464v1.CreateSageApplicationRequest;
import gold.proto.p464v1.CreateSageApplicationRequestDto;
import gold.proto.p464v1.CreateSageApplicationResponse;
import gold.proto.p464v1.CreateSageApplicationResponseDto;
import gold.proto.p464v1.GoldSageAgreement;
import gold.proto.p464v1.GoldSageMortgageType;
import gold.proto.p464v1.GoldService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldSageStartApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageStartApplicationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationViewState;", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "goldService", "Lgold/proto/v1/GoldService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lgold/proto/v1/GoldService;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStartApplication", "", "mortgageType", "Lgold/proto/v1/GoldSageMortgageType;", "sageId", "", "Companion", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSageStartApplicationDuxo extends BaseDuxo5<GoldSageStartApplicationViewState, GoldSageStartApplicationEvent> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final GoldService goldService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageStartApplicationDuxo(AgreementsStore agreementsStore, GoldService goldService, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new GoldSageStartApplicationViewState(false), duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(goldService, "goldService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.agreementsStore = agreementsStore;
        this.goldService = goldService;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GoldSageStartApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$1", m3645f = "GoldSageStartApplicationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$1 */
    static final class C178971 extends ContinuationImpl7 implements Function2<GoldSageStartApplicationViewState, Continuation<? super GoldSageStartApplicationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C178971(Continuation<? super C178971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C178971 c178971 = new C178971(continuation);
            c178971.L$0 = obj;
            return c178971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GoldSageStartApplicationViewState goldSageStartApplicationViewState, Continuation<? super GoldSageStartApplicationViewState> continuation) {
            return ((C178971) create(goldSageStartApplicationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((GoldSageStartApplicationViewState) this.L$0).copy(true);
        }
    }

    public final void onStartApplication(GoldSageMortgageType mortgageType, String sageId) {
        Intrinsics.checkNotNullParameter(mortgageType, "mortgageType");
        applyMutation(new C178971(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C178982(mortgageType, sageId, null), 3, null);
    }

    /* compiled from: GoldSageStartApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$2", m3645f = "GoldSageStartApplicationDuxo.kt", m3646l = {40, 59}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$2 */
    static final class C178982 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GoldSageMortgageType $mortgageType;
        final /* synthetic */ String $sageId;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C178982(GoldSageMortgageType goldSageMortgageType, String str, Continuation<? super C178982> continuation) {
            super(2, continuation);
            this.$mortgageType = goldSageMortgageType;
            this.$sageId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C178982 c178982 = GoldSageStartApplicationDuxo.this.new C178982(this.$mortgageType, this.$sageId, continuation);
            c178982.L$0 = obj;
            return c178982;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C178982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0137, code lost:
        
            if (r14 == r1) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:13:0x003a, B:25:0x009d, B:19:0x0075, B:21:0x007b, B:26:0x00a6, B:27:0x00b7, B:29:0x00bd, B:30:0x00f2, B:18:0x004b), top: B:50:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:13:0x003a, B:25:0x009d, B:19:0x0075, B:21:0x007b, B:26:0x00a6, B:27:0x00b7, B:29:0x00bd, B:30:0x00f2, B:18:0x004b), top: B:50:0x000b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009c -> B:25:0x009d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object objM28550constructorimpl2;
            Iterator it;
            Collection collection;
            CoroutineScope coroutineScope;
            GoldSageStartApplicationDuxo goldSageStartApplicationDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                GoldSageStartApplicationDuxo goldSageStartApplicationDuxo2 = GoldSageStartApplicationDuxo.this;
                Result.Companion companion3 = Result.INSTANCE;
                List<String> agreement_type = ((GoldSageDestinationArgs) GoldSageStartApplicationDuxo.INSTANCE.getArgs((HasSavedState) goldSageStartApplicationDuxo2)).getGoldSageFlow().getApplication().getAgreement_type();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreement_type, 10));
                it = agreement_type.iterator();
                collection = arrayList;
                coroutineScope = coroutineScope2;
                goldSageStartApplicationDuxo = goldSageStartApplicationDuxo2;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM28550constructorimpl2 = Result.m28550constructorimpl(((CreateSageApplicationResponseDto) obj).toProto());
                    GoldSageStartApplicationDuxo goldSageStartApplicationDuxo3 = GoldSageStartApplicationDuxo.this;
                    Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl2);
                    if (thM28553exceptionOrNullimpl == null) {
                        goldSageStartApplicationDuxo3.submit(new GoldSageStartApplicationEvent.Success((CreateSageApplicationResponse) objM28550constructorimpl2));
                    } else {
                        goldSageStartApplicationDuxo3.submit(new GoldSageStartApplicationEvent.Failure(thM28553exceptionOrNullimpl));
                    }
                    GoldSageStartApplicationDuxo.this.applyMutation(new AnonymousClass4(null));
                    return Unit.INSTANCE;
                }
                String str = (String) this.L$5;
                collection = (Collection) this.L$4;
                it = (Iterator) this.L$3;
                Collection collection2 = (Collection) this.L$2;
                goldSageStartApplicationDuxo = (GoldSageStartApplicationDuxo) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                collection.add(Tuples4.m3642to(str, obj));
                collection = collection2;
                if (it.hasNext()) {
                    str = (String) it.next();
                    AgreementsStore agreementsStore = goldSageStartApplicationDuxo.agreementsStore;
                    this.L$0 = coroutineScope;
                    this.L$1 = goldSageStartApplicationDuxo;
                    this.L$2 = collection;
                    this.L$3 = it;
                    this.L$4 = collection;
                    this.L$5 = str;
                    this.label = 1;
                    obj = agreementsStore.getAgreementWithContent(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    collection2 = collection;
                    collection.add(Tuples4.m3642to(str, obj));
                    collection = collection2;
                    if (it.hasNext()) {
                        List<Tuples2> list = (List) collection;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (Tuples2 tuples2 : list) {
                            String str2 = (String) tuples2.component1();
                            UiAgreementWithContent uiAgreementWithContent = (UiAgreementWithContent) tuples2.component2();
                            String string2 = uiAgreementWithContent.getApiAgreement().getId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new GoldSageAgreement(string2, uiAgreementWithContent.getSha256(), str2, null, 8, null));
                        }
                        objM28550constructorimpl = Result.m28550constructorimpl(arrayList2);
                        GoldSageStartApplicationDuxo goldSageStartApplicationDuxo4 = GoldSageStartApplicationDuxo.this;
                        Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl2 != null) {
                            goldSageStartApplicationDuxo4.submit(new GoldSageStartApplicationEvent.Failure(thM28553exceptionOrNullimpl2));
                            goldSageStartApplicationDuxo4.applyMutation(new GoldSageStartApplicationDuxo2(null));
                            return Unit.INSTANCE;
                        }
                        List list2 = (List) objM28550constructorimpl;
                        GoldSageStartApplicationDuxo goldSageStartApplicationDuxo5 = GoldSageStartApplicationDuxo.this;
                        GoldSageMortgageType goldSageMortgageType = this.$mortgageType;
                        String str3 = this.$sageId;
                        GoldService goldService = goldSageStartApplicationDuxo5.goldService;
                        CreateSageApplicationRequestDto createSageApplicationRequestDtoFromProto = CreateSageApplicationRequestDto.INSTANCE.fromProto(new CreateSageApplicationRequest(goldSageMortgageType, list2, str3, null, 8, null));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        obj = goldService.CreateSageApplication(createSageApplicationRequestDtoFromProto, this);
                    }
                }
            }
        }

        /* compiled from: GoldSageStartApplicationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$2$4", m3645f = "GoldSageStartApplicationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<GoldSageStartApplicationViewState, Continuation<? super GoldSageStartApplicationViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldSageStartApplicationViewState goldSageStartApplicationViewState, Continuation<? super GoldSageStartApplicationViewState> continuation) {
                return ((AnonymousClass4) create(goldSageStartApplicationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((GoldSageStartApplicationViewState) this.L$0).copy(false);
            }
        }
    }

    /* compiled from: GoldSageStartApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageStartApplicationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationDuxo;", "Lcom/robinhood/android/gold/sage/data/GoldSageDestinationArgs;", "<init>", "()V", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldSageStartApplicationDuxo, GoldSageDestinationArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldSageDestinationArgs getArgs(SavedStateHandle savedStateHandle) {
            return (GoldSageDestinationArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldSageDestinationArgs getArgs(GoldSageStartApplicationDuxo goldSageStartApplicationDuxo) {
            return (GoldSageDestinationArgs) DuxoCompanion.DefaultImpls.getArgs(this, goldSageStartApplicationDuxo);
        }
    }
}
