package com.robinhood.android.acatsin.partials.option;

import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetEvent;
import com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsOptionValidationResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import com.robinhood.time.format.DateTimeFormatters;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.LocalDate;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalQuery;

/* compiled from: AcatsInPartialOptionAssetDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001&B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetViewState;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsValidationStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setDirection", "direction", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "setIsAllContracts", "isAllContracts", "", "setNumContracts", "text", "", "setOptionType", "optionType", "Lcom/robinhood/models/db/OptionContractType;", "setExpirationDate", "", "setStrikePrice", "strikePrice", "Lcom/robinhood/models/util/Money;", "validateOptionContract", "unvalidatedContract", "Lcom/robinhood/android/acatsin/partials/option/UnvalidatedOptionContract;", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPartialOptionAssetDuxo extends BaseDuxo3<AcatsInPartialOptionAssetDataState, AcatsInPartialOptionAssetViewState, AcatsInPartialOptionAssetEvent> implements HasSavedState {
    private final AcatsValidationStore acatsValidationStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInPartialOptionAssetDuxo(AcatsValidationStore acatsValidationStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(acatsValidationStore, "acatsValidationStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new AcatsInPartialOptionAssetDataState(((AcatsInPartialOptionAssetFragment.Args) companion.getArgs(savedStateHandle)).getInstrumentId(), ((AcatsInPartialOptionAssetFragment.Args) companion.getArgs(savedStateHandle)).getSymbol(), ((AcatsInPartialOptionAssetFragment.Args) companion.getArgs(savedStateHandle)).getAssetToModify(), null, null, null, null, null, null, false, 1016, null), new AcatsInPartialOptionAssetStateProvider(), duxoBundle);
        this.acatsValidationStore = acatsValidationStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        UiAcatsAsset.OptionAsset assetToModify = ((AcatsInPartialOptionAssetFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAssetToModify();
        if (assetToModify != null) {
            submit(new AcatsInPartialOptionAssetEvent.PopulateEditUiEvent(assetToModify));
        }
    }

    /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setDirection$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setDirection$1 */
    static final class C79961 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {
        final /* synthetic */ ApiAcatsTransfer.Asset.Direction $direction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79961(ApiAcatsTransfer.Asset.Direction direction, Continuation<? super C79961> continuation) {
            super(2, continuation);
            this.$direction = direction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79961 c79961 = new C79961(this.$direction, continuation);
            c79961.L$0 = obj;
            return c79961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
            return ((C79961) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialOptionAssetDataState.copy$default((AcatsInPartialOptionAssetDataState) this.L$0, null, null, null, this.$direction, null, null, null, null, null, false, 1015, null);
        }
    }

    public final void setDirection(ApiAcatsTransfer.Asset.Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        applyMutation(new C79961(direction, null));
    }

    /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setIsAllContracts$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setIsAllContracts$1 */
    static final class C79981 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {
        final /* synthetic */ boolean $isAllContracts;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79981(boolean z, Continuation<? super C79981> continuation) {
            super(2, continuation);
            this.$isAllContracts = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79981 c79981 = new C79981(this.$isAllContracts, continuation);
            c79981.L$0 = obj;
            return c79981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
            return ((C79981) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialOptionAssetDataState.copy$default((AcatsInPartialOptionAssetDataState) this.L$0, null, null, null, null, boxing.boxBoolean(this.$isAllContracts), null, null, null, null, false, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    public final void setIsAllContracts(boolean isAllContracts) {
        applyMutation(new C79981(isAllContracts, null));
    }

    /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setNumContracts$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setNumContracts$1 */
    static final class C79991 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {
        final /* synthetic */ Integer $numContracts;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79991(Integer num, Continuation<? super C79991> continuation) {
            super(2, continuation);
            this.$numContracts = num;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79991 c79991 = new C79991(this.$numContracts, continuation);
            c79991.L$0 = obj;
            return c79991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
            return ((C79991) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialOptionAssetDataState.copy$default((AcatsInPartialOptionAssetDataState) this.L$0, null, null, null, null, null, this.$numContracts, null, null, null, false, 991, null);
        }
    }

    public final void setNumContracts(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        applyMutation(new C79991(StringsKt.toIntOrNull(text.toString()), null));
    }

    /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setOptionType$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setOptionType$1 */
    static final class C80001 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {
        final /* synthetic */ OptionContractType $optionType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C80001(OptionContractType optionContractType, Continuation<? super C80001> continuation) {
            super(2, continuation);
            this.$optionType = optionContractType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C80001 c80001 = new C80001(this.$optionType, continuation);
            c80001.L$0 = obj;
            return c80001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
            return ((C80001) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialOptionAssetDataState.copy$default((AcatsInPartialOptionAssetDataState) this.L$0, null, null, null, null, null, null, this.$optionType, null, null, false, 959, null);
        }
    }

    public final void setOptionType(OptionContractType optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        applyMutation(new C80001(optionType, null));
    }

    public final void setExpirationDate(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMddyyyy");
        Intrinsics.checkNotNull(dateTimeFormatterOfPattern);
        LocalDate localDate = (LocalDate) DateTimeFormatters.parseOrNull(dateTimeFormatterOfPattern, text, new TemporalQuery() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setExpirationDate$expirationDate$1
            @Override // p479j$.time.temporal.TemporalQuery
            public final LocalDate queryFrom(TemporalAccessor temporalAccessor) {
                return LocalDate.from(temporalAccessor);
            }
        });
        if (localDate == null) {
            submit(AcatsInPartialOptionAssetEvent.InvalidDateEvent.INSTANCE);
        }
        applyMutation(new C79971(localDate, null));
    }

    /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setExpirationDate$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setExpirationDate$1 */
    static final class C79971 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {
        final /* synthetic */ LocalDate $expirationDate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79971(LocalDate localDate, Continuation<? super C79971> continuation) {
            super(2, continuation);
            this.$expirationDate = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79971 c79971 = new C79971(this.$expirationDate, continuation);
            c79971.L$0 = obj;
            return c79971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
            return ((C79971) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialOptionAssetDataState.copy$default((AcatsInPartialOptionAssetDataState) this.L$0, null, null, null, null, null, null, null, this.$expirationDate, null, false, 895, null);
        }
    }

    /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setStrikePrice$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$setStrikePrice$1 */
    static final class C80011 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {
        final /* synthetic */ Money $strikePrice;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C80011(Money money, Continuation<? super C80011> continuation) {
            super(2, continuation);
            this.$strikePrice = money;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C80011 c80011 = new C80011(this.$strikePrice, continuation);
            c80011.L$0 = obj;
            return c80011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
            return ((C80011) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialOptionAssetDataState.copy$default((AcatsInPartialOptionAssetDataState) this.L$0, null, null, null, null, null, null, null, null, this.$strikePrice, false, 767, null);
        }
    }

    public final void setStrikePrice(Money strikePrice) {
        applyMutation(new C80011(strikePrice, null));
    }

    public final void validateOptionContract(final UnvalidatedOptionContract unvalidatedContract) {
        Intrinsics.checkNotNullParameter(unvalidatedContract, "unvalidatedContract");
        Single<UiAcatsOptionValidationResponse> singleDoOnSubscribe = this.acatsValidationStore.postOptionValidationRequest(unvalidatedContract.toValidationRequest()).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo.validateOptionContract.1

            /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$validateOptionContract$1$1", m3645f = "AcatsInPartialOptionAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$validateOptionContract$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState>, Object> {
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
                public final Object invoke(AcatsInPartialOptionAssetDataState acatsInPartialOptionAssetDataState, Continuation<? super AcatsInPartialOptionAssetDataState> continuation) {
                    return ((AnonymousClass1) create(acatsInPartialOptionAssetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AcatsInPartialOptionAssetDataState.copy$default((AcatsInPartialOptionAssetDataState) this.L$0, null, null, null, null, null, null, null, null, null, true, 511, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                AcatsInPartialOptionAssetDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInPartialOptionAssetDuxo.validateOptionContract$lambda$1(unvalidatedContract, this, (UiAcatsOptionValidationResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInPartialOptionAssetDuxo.validateOptionContract$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateOptionContract$lambda$1(UnvalidatedOptionContract unvalidatedOptionContract, AcatsInPartialOptionAssetDuxo acatsInPartialOptionAssetDuxo, UiAcatsOptionValidationResponse uiAcatsOptionValidationResponse) {
        acatsInPartialOptionAssetDuxo.applyMutation(new AcatsInPartialOptionAssetDuxo3(acatsInPartialOptionAssetDuxo, unvalidatedOptionContract.constructValidatedOption(uiAcatsOptionValidationResponse.getOptionId()), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateOptionContract$lambda$2(AcatsInPartialOptionAssetDuxo acatsInPartialOptionAssetDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        acatsInPartialOptionAssetDuxo.applyMutation(new AcatsInPartialOptionAssetDuxo4(t, acatsInPartialOptionAssetDuxo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInPartialOptionAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDuxo;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInPartialOptionAssetDuxo, AcatsInPartialOptionAssetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPartialOptionAssetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInPartialOptionAssetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPartialOptionAssetFragment.Args getArgs(AcatsInPartialOptionAssetDuxo acatsInPartialOptionAssetDuxo) {
            return (AcatsInPartialOptionAssetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, acatsInPartialOptionAssetDuxo);
        }
    }
}
