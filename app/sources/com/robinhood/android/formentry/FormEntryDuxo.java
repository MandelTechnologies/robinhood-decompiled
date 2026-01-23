package com.robinhood.android.formentry;

import com.robinhood.android.formentry.data.FormEntryMode;
import com.robinhood.android.formentry.data.FormEntryType;
import com.robinhood.android.formentry.data.FormEntryType2;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputErrorDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormReviewItemDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormService;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetFormErrorsRequestDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetFormErrorsResponseDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetFormForTypeRequestDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetFormForTypeResponseDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetWireInformationForServerRequestDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetWireInformationForServerResponseDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetWireReviewScreenDisplayFieldsRequestDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.GetWireReviewScreenDisplayFieldsResponseDto;

/* compiled from: FormEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001cJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190 J*\u0010!\u001a\u00020\u00122\"\u0010\"\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00170$\u0012\u0004\u0012\u00020\u00120#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/formentry/FormEntryDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/formentry/FormEntryDataState;", "Lcom/robinhood/android/formentry/FormEntryViewState;", "Lcom/robinhood/android/formentry/FormEntryEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/MicrogramManager;", "formSource", "Lmicrogram/android/RemoteMicrogramApplication;", "formService", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "launch", "", "formType", "Lcom/robinhood/android/formentry/data/FormEntryType;", "valueChangedForIndex", "newValue", "", "dto", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "canContinue", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showReviewScreen", "getPayloadForRequests", "fields", "Lkotlinx/collections/immutable/ImmutableList;", "getAccountAndRoutingForRequest", "callback", "Lkotlin/Function1;", "Lkotlin/Pair;", "lib-form-entry_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FormEntryDuxo extends BaseDuxo3<FormEntryDataState, FormEntryViewState, FormEntryEvent> {
    public static final int $stable = 8;
    private FormService formService;
    private final RemoteMicrogramApplication formSource;
    private final MicrogramManager microgramManager;

    /* compiled from: FormEntryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.formentry.FormEntryDuxo", m3645f = "FormEntryDuxo.kt", m3646l = {77}, m3647m = "canContinue")
    /* renamed from: com.robinhood.android.formentry.FormEntryDuxo$canContinue$1 */
    static final class C169171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C169171(Continuation<? super C169171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FormEntryDuxo.this.canContinue(this);
        }
    }

    /* compiled from: FormEntryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.formentry.FormEntryDuxo", m3645f = "FormEntryDuxo.kt", m3646l = {96}, m3647m = "getPayloadForRequests")
    /* renamed from: com.robinhood.android.formentry.FormEntryDuxo$getPayloadForRequests$1 */
    static final class C169181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C169181(Continuation<? super C169181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FormEntryDuxo.this.getPayloadForRequests(this);
        }
    }

    public final MicrogramManager getMicrogramManager() {
        return this.microgramManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormEntryDuxo(DuxoBundle duxoBundle, MicrogramManager microgramManager) {
        super(new FormEntryDataState(CollectionsKt.emptyList(), CollectionsKt.emptyList(), FormEntryMode.INPUT_ENTRY), new FormEntryStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        this.microgramManager = microgramManager;
        this.formSource = new RemoteMicrogramApplication("app-transfers-form-entry", null, 2, null);
    }

    public final void launch(FormEntryType formType) {
        Intrinsics.checkNotNullParameter(formType, "formType");
        this.formService = (FormService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, getLifecycleScope(), new MicrogramLaunchId(this.formSource, null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(FormService.class);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C169191(formType, null), 3, null);
    }

    /* compiled from: FormEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.formentry.FormEntryDuxo$launch$1", m3645f = "FormEntryDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.formentry.FormEntryDuxo$launch$1 */
    static final class C169191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FormEntryType $formType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C169191(FormEntryType formEntryType, Continuation<? super C169191> continuation) {
            super(2, continuation);
            this.$formType = formEntryType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FormEntryDuxo.this.new C169191(this.$formType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C169191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FormService formService = FormEntryDuxo.this.formService;
                if (formService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("formService");
                    formService = null;
                }
                GetFormForTypeRequestDto getFormForTypeRequestDto = new GetFormForTypeRequestDto(FormEntryType2.getFormEntryDto(this.$formType));
                this.label = 1;
                obj = formService.GetFormForType(getFormForTypeRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FormEntryDuxo.this.applyMutation(new AnonymousClass1((GetFormForTypeResponseDto) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: FormEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/formentry/FormEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.formentry.FormEntryDuxo$launch$1$1", m3645f = "FormEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.formentry.FormEntryDuxo$launch$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FormEntryDataState, Continuation<? super FormEntryDataState>, Object> {
            final /* synthetic */ GetFormForTypeResponseDto $formData;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetFormForTypeResponseDto getFormForTypeResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$formData = getFormForTypeResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$formData, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FormEntryDataState formEntryDataState, Continuation<? super FormEntryDataState> continuation) {
                return ((AnonymousClass1) create(formEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FormEntryDataState.copy$default((FormEntryDataState) this.L$0, this.$formData.getInputs(), null, null, 6, null);
            }
        }
    }

    /* compiled from: FormEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/formentry/FormEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.formentry.FormEntryDuxo$valueChangedForIndex$1", m3645f = "FormEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.formentry.FormEntryDuxo$valueChangedForIndex$1 */
    static final class C169211 extends ContinuationImpl7 implements Function2<FormEntryDataState, Continuation<? super FormEntryDataState>, Object> {
        final /* synthetic */ FormInputDto $dto;
        final /* synthetic */ String $newValue;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C169211(FormInputDto formInputDto, String str, Continuation<? super C169211> continuation) {
            super(2, continuation);
            this.$dto = formInputDto;
            this.$newValue = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169211 c169211 = new C169211(this.$dto, this.$newValue, continuation);
            c169211.L$0 = obj;
            return c169211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FormEntryDataState formEntryDataState, Continuation<? super FormEntryDataState> continuation) {
            return ((C169211) create(formEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FormEntryDataState formEntryDataState = (FormEntryDataState) this.L$0;
            List mutableList = CollectionsKt.toMutableList((Collection) formEntryDataState.getFields());
            FormInputDto formInputDto = this.$dto;
            Iterator it = mutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((FormInputDto) next).getType(), formInputDto.getType())) {
                    break;
                }
            }
            int iIndexOf = CollectionsKt.indexOf((List<? extends Object>) mutableList, next);
            mutableList.remove(iIndexOf);
            mutableList.add(iIndexOf, FormInputDto.copy$default(this.$dto, null, null, null, this.$newValue, null, 23, null));
            return FormEntryDataState.copy$default(formEntryDataState, mutableList, null, null, 6, null);
        }
    }

    public final void valueChangedForIndex(String newValue, FormInputDto dto) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(dto, "dto");
        applyMutation(new C169211(dto, newValue, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object canContinue(Continuation<? super Boolean> continuation) {
        C169171 c169171;
        List<FormInputErrorDto> errors;
        if (continuation instanceof C169171) {
            c169171 = (C169171) continuation;
            int i = c169171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c169171.label = i - Integer.MIN_VALUE;
            } else {
                c169171 = new C169171(continuation);
            }
        }
        Object objGetFormErrors = c169171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c169171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFormErrors);
            FormService formService = this.formService;
            if (formService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("formService");
                formService = null;
            }
            GetFormErrorsRequestDto getFormErrorsRequestDto = new GetFormErrorsRequestDto(getStateFlow().getValue().getFields());
            c169171.label = 1;
            objGetFormErrors = formService.GetFormErrors(getFormErrorsRequestDto, c169171);
            if (objGetFormErrors == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFormErrors);
        }
        GetFormErrorsResponseDto getFormErrorsResponseDto = (GetFormErrorsResponseDto) objGetFormErrors;
        if (getFormErrorsResponseDto == null || (errors = getFormErrorsResponseDto.getErrors()) == null) {
            return null;
        }
        return boxing.boxBoolean(errors.isEmpty());
    }

    /* compiled from: FormEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/formentry/FormEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.formentry.FormEntryDuxo$showReviewScreen$1", m3645f = "FormEntryDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.formentry.FormEntryDuxo$showReviewScreen$1 */
    static final class C169201 extends ContinuationImpl7 implements Function2<FormEntryDataState, Continuation<? super FormEntryDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C169201(Continuation<? super C169201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169201 c169201 = FormEntryDuxo.this.new C169201(continuation);
            c169201.L$0 = obj;
            return c169201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FormEntryDataState formEntryDataState, Continuation<? super FormEntryDataState> continuation) {
            return ((C169201) create(formEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            FormEntryDataState formEntryDataState;
            List<FormReviewItemDto> listEmptyList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FormEntryDataState formEntryDataState2 = (FormEntryDataState) this.L$0;
                FormService formService = FormEntryDuxo.this.formService;
                if (formService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("formService");
                    formService = null;
                }
                GetWireReviewScreenDisplayFieldsRequestDto getWireReviewScreenDisplayFieldsRequestDto = new GetWireReviewScreenDisplayFieldsRequestDto(formEntryDataState2.getFields());
                this.L$0 = formEntryDataState2;
                this.label = 1;
                Object objGetWireReviewScreenDisplayFields = formService.GetWireReviewScreenDisplayFields(getWireReviewScreenDisplayFieldsRequestDto, this);
                if (objGetWireReviewScreenDisplayFields == coroutine_suspended) {
                    return coroutine_suspended;
                }
                formEntryDataState = formEntryDataState2;
                obj = objGetWireReviewScreenDisplayFields;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                formEntryDataState = (FormEntryDataState) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            GetWireReviewScreenDisplayFieldsResponseDto getWireReviewScreenDisplayFieldsResponseDto = (GetWireReviewScreenDisplayFieldsResponseDto) obj;
            if (getWireReviewScreenDisplayFieldsResponseDto == null || (listEmptyList = getWireReviewScreenDisplayFieldsResponseDto.getItems()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return FormEntryDataState.copy$default(formEntryDataState, null, listEmptyList, FormEntryMode.REVIEW, 1, null);
        }
    }

    public final void showReviewScreen() {
        applyMutation(new C169201(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPayloadForRequests(Continuation<? super String> continuation) {
        C169181 c169181;
        if (continuation instanceof C169181) {
            c169181 = (C169181) continuation;
            int i = c169181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c169181.label = i - Integer.MIN_VALUE;
            } else {
                c169181 = new C169181(continuation);
            }
        }
        Object objGetWireInformationForServer = c169181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c169181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetWireInformationForServer);
            FormService formService = this.formService;
            if (formService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("formService");
                formService = null;
            }
            GetWireInformationForServerRequestDto getWireInformationForServerRequestDto = new GetWireInformationForServerRequestDto(getStateFlow().getValue().getFields());
            c169181.label = 1;
            objGetWireInformationForServer = formService.GetWireInformationForServer(getWireInformationForServerRequestDto, c169181);
            if (objGetWireInformationForServer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetWireInformationForServer);
        }
        return ((GetWireInformationForServerResponseDto) objGetWireInformationForServer).getPayload();
    }

    public final ImmutableList<FormInputDto> fields() {
        return getStateFlow().getValue().getFields();
    }

    public final void getAccountAndRoutingForRequest(final Function1<? super Tuples2<String, String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        withDataState(new Function1() { // from class: com.robinhood.android.formentry.FormEntryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FormEntryDuxo.getAccountAndRoutingForRequest$lambda$0(this.f$0, callback, (FormEntryDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountAndRoutingForRequest$lambda$0(FormEntryDuxo formEntryDuxo, Function1 function1, FormEntryDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BuildersKt__Builders_commonKt.launch$default(formEntryDuxo.getLifecycleScope(), null, null, new FormEntryDuxo2(formEntryDuxo, dataState, function1, null), 3, null);
        return Unit.INSTANCE;
    }
}
