package com.robinhood.shared.crypto.acats.submitassets;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.MigrationSubmitAssetsDest;
import com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo2;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import crypto_portkey.service.p443v1.MigrationAuthedErrorCodeDto;
import crypto_portkey.service.p443v1.MigrationService;
import crypto_portkey.service.p443v1.ProcessMigrationAuthedRequestDto;
import crypto_portkey.service.p443v1.ProcessMigrationAuthedResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: MigrationSubmitAssetsDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\u001dB9\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDataState;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsViewState;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/acats/MigrationSubmitAssetsDest$Args;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "Lcrypto_portkey/service/v1/MigrationService;", "migrationService", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsStateProvider;Landroidx/lifecycle/SavedStateHandle;Landroid/content/res/Resources;Lj$/time/Clock;Lcrypto_portkey/service/v1/MigrationService;)V", "", "submitMigration", "()V", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lj$/time/Clock;", "Lcrypto_portkey/service/v1/MigrationService;", "Companion", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationSubmitAssetsDuxo extends BaseDuxo3<MigrationSubmitAssetsDataState, MigrationSubmitAssetsViewState, MigrationSubmitAssetsDuxo2> implements HasArgs<MigrationSubmitAssetsDest.Args> {
    private final Clock clock;
    private final MigrationService migrationService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public MigrationSubmitAssetsDest.Args getArgs(SavedStateHandle savedStateHandle) {
        return (MigrationSubmitAssetsDest.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationSubmitAssetsDuxo(DuxoBundle duxoBundle, MigrationSubmitAssetsDuxo3 stateProvider, SavedStateHandle savedStateHandle, Resources resources, Clock clock, MigrationService migrationService) {
        super(new MigrationSubmitAssetsDataState(false, ((MigrationSubmitAssetsDest.Args) INSTANCE.getArgs(savedStateHandle)).getMigrationResponse(), resources, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(migrationService, "migrationService");
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.migrationService = migrationService;
    }

    /* compiled from: MigrationSubmitAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDuxo;", "Lcom/robinhood/shared/crypto/acats/MigrationSubmitAssetsDest$Args;", "<init>", "()V", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<MigrationSubmitAssetsDuxo, MigrationSubmitAssetsDest.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public MigrationSubmitAssetsDest.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MigrationSubmitAssetsDest.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public MigrationSubmitAssetsDest.Args getArgs(MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo) {
            return (MigrationSubmitAssetsDest.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, migrationSubmitAssetsDuxo);
        }
    }

    /* compiled from: MigrationSubmitAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo$submitMigration$1", m3645f = "MigrationSubmitAssetsDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo$submitMigration$1 */
    static final class C376001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C376001(Continuation<? super C376001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MigrationSubmitAssetsDuxo.this.new C376001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C376001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MigrationSubmitAssetsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo$submitMigration$1$1", m3645f = "MigrationSubmitAssetsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo$submitMigration$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MigrationSubmitAssetsDataState, Continuation<? super MigrationSubmitAssetsDataState>, Object> {
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
            public final Object invoke(MigrationSubmitAssetsDataState migrationSubmitAssetsDataState, Continuation<? super MigrationSubmitAssetsDataState> continuation) {
                return ((AnonymousClass1) create(migrationSubmitAssetsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MigrationSubmitAssetsDataState.copy$default((MigrationSubmitAssetsDataState) this.L$0, true, null, null, 6, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            StringResource stringResourceInvoke;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MigrationSubmitAssetsDuxo.this.applyMutation(new AnonymousClass1(null));
                    MigrationService migrationService = MigrationSubmitAssetsDuxo.this.migrationService;
                    MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo = MigrationSubmitAssetsDuxo.this;
                    ProcessMigrationAuthedRequestDto processMigrationAuthedRequestDto = new ProcessMigrationAuthedRequestDto(((MigrationSubmitAssetsDest.Args) migrationSubmitAssetsDuxo.getArgs(migrationSubmitAssetsDuxo.getSavedStateHandle())).getRefId(), MigrationSubmitAssetsDuxo.this.clock.millis(), "migration_request", null, "bitstamp", 8, null);
                    this.label = 1;
                    obj = migrationService.ProcessMigrationAuthed(processMigrationAuthedRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto = (ProcessMigrationAuthedResponseDto) obj;
                if (Intrinsics.areEqual(processMigrationAuthedResponseDto.getSuccess(), boxing.boxBoolean(true))) {
                    MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo2 = MigrationSubmitAssetsDuxo.this;
                    String migration_id = processMigrationAuthedResponseDto.getMigration_id();
                    if (migration_id != null) {
                        migrationSubmitAssetsDuxo2.submit(new MigrationSubmitAssetsDuxo2.NavigateToConfirmation(StringsKt.toUuid(migration_id)));
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (processMigrationAuthedResponseDto.getError_code() == MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_RETRYABLE) {
                    MigrationSubmitAssetsDuxo migrationSubmitAssetsDuxo3 = MigrationSubmitAssetsDuxo.this;
                    String error_message = processMigrationAuthedResponseDto.getError_message();
                    if (error_message == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(error_message)) == null) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C37511R.string.crypto_acats_confirmation_fallback_error_message_try_again, new Object[0]);
                    }
                    migrationSubmitAssetsDuxo3.submit(new MigrationSubmitAssetsDuxo2.RetriableError(stringResourceInvoke));
                } else if (processMigrationAuthedResponseDto.getError_code() == MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE) {
                    MigrationSubmitAssetsDuxo.this.submit(MigrationSubmitAssetsDuxo2.NonRetriableError.INSTANCE);
                } else if (processMigrationAuthedResponseDto.getError_code() == MigrationAuthedErrorCodeDto.MIGRATION_AUTHED_ERROR_CODE_NON_RETRYABLE_CONTACT_SUPPORT) {
                    MigrationSubmitAssetsDuxo.this.submit(new MigrationSubmitAssetsDuxo2.NonRetriableContactSupportError(processMigrationAuthedResponseDto.getError_deeplink()));
                }
            } catch (Exception e) {
                MigrationSubmitAssetsDuxo.this.applyMutation(new AnonymousClass3(null));
                if (Throwables.isNetworkRelated(e)) {
                    MigrationSubmitAssetsDuxo.this.submit(new MigrationSubmitAssetsDuxo2.Error(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MigrationSubmitAssetsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo$submitMigration$1$3", m3645f = "MigrationSubmitAssetsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsDuxo$submitMigration$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<MigrationSubmitAssetsDataState, Continuation<? super MigrationSubmitAssetsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MigrationSubmitAssetsDataState migrationSubmitAssetsDataState, Continuation<? super MigrationSubmitAssetsDataState> continuation) {
                return ((AnonymousClass3) create(migrationSubmitAssetsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MigrationSubmitAssetsDataState.copy$default((MigrationSubmitAssetsDataState) this.L$0, false, null, null, 6, null);
            }
        }
    }

    public final void submitMigration() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C376001(null), 3, null);
    }
}
