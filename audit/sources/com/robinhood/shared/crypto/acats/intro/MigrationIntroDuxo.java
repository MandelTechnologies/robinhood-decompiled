package com.robinhood.shared.crypto.acats.intro;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.extensions.Throwables;
import crypto_portkey.service.p443v1.CheckMigrationEligibilityAuthedRequestDto;
import crypto_portkey.service.p443v1.CheckMigrationEligibilityAuthedResponseDto;
import crypto_portkey.service.p443v1.MigrationService;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MigrationIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDataState;", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "migrationService", "Lcrypto_portkey/service/v1/MigrationService;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcrypto_portkey/service/v1/MigrationService;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "refId", "", "getRefId", "()Ljava/lang/String;", "onCreate", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationIntroDuxo extends BaseDuxo<MigrationIntroDataState, MigrationIntroViewState> implements HasSavedState {
    public static final int $stable = 8;
    private final MigrationService migrationService;
    private final String refId;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MigrationIntroDuxo(DuxoBundle duxoBundle, MigrationIntroDuxo2 stateProvider, SavedStateHandle savedStateHandle, MigrationService migrationService) {
        super(new MigrationIntroDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(migrationService, "migrationService");
        this.savedStateHandle = savedStateHandle;
        this.migrationService = migrationService;
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.refId = string2;
    }

    public final String getRefId() {
        return this.refId;
    }

    /* compiled from: MigrationIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.intro.MigrationIntroDuxo$onCreate$1", m3645f = "MigrationIntroDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.acats.intro.MigrationIntroDuxo$onCreate$1 */
    static final class C375691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C375691(Continuation<? super C375691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MigrationIntroDuxo.this.new C375691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C375691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MigrationService migrationService = MigrationIntroDuxo.this.migrationService;
                    CheckMigrationEligibilityAuthedRequestDto checkMigrationEligibilityAuthedRequestDto = new CheckMigrationEligibilityAuthedRequestDto("bitstamp");
                    this.label = 1;
                    obj = migrationService.CheckMigrationEligibilityAuthed(checkMigrationEligibilityAuthedRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MigrationIntroDuxo.this.applyMutation(new AnonymousClass1((CheckMigrationEligibilityAuthedResponseDto) obj, null));
            } catch (Exception e) {
                if (!Throwables.isNetworkRelated(e)) {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MigrationIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.intro.MigrationIntroDuxo$onCreate$1$1", m3645f = "MigrationIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.acats.intro.MigrationIntroDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MigrationIntroDataState, Continuation<? super MigrationIntroDataState>, Object> {
            final /* synthetic */ CheckMigrationEligibilityAuthedResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CheckMigrationEligibilityAuthedResponseDto checkMigrationEligibilityAuthedResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = checkMigrationEligibilityAuthedResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MigrationIntroDataState migrationIntroDataState, Continuation<? super MigrationIntroDataState> continuation) {
                return ((AnonymousClass1) create(migrationIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((MigrationIntroDataState) this.L$0).copy(this.$response);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C375691(null));
    }
}
