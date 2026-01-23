package com.robinhood.android.acatsin.accountnumber;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import com.robinhood.models.api.bonfire.ApiAcatsAccountNumberValidationRequest;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.view.Drawables;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: AcatsInAccountNumberDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001 B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDataState;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberViewState;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberEvent;", "Lcom/robinhood/android/rhimage/ImageLoader$Target;", "Lcom/robinhood/android/udf/HasSavedState;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "acatsValidationStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;", "stateProvider", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/rhimage/ImageLoader;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "validateAccountNumber", "accountNumber", "", "onSuccess", "result", "Landroid/graphics/drawable/Drawable;", "onError", "error", "placeholder", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAccountNumberDuxo extends BaseDuxo3<AcatsInAccountNumberDataState, AcatsInAccountNumberViewState, AcatsInAccountNumberEvent> implements ImageLoader.Target, HasSavedState {
    private final AcatsValidationStore acatsValidationStore;
    private final ImageLoader imageLoader;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onError(Drawable error) {
    }

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onStart(Drawable placeholder) {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInAccountNumberDuxo(ImageLoader imageLoader, AcatsValidationStore acatsValidationStore, AcatsInAccountNumberStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(acatsValidationStore, "acatsValidationStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AcatsInAccountNumberDataState(((AcatsInAccountNumberContract.Key) companion.getArgs(savedStateHandle)).getBrokerageOrDtcNumber(), ((AcatsInAccountNumberContract.Key) companion.getArgs(savedStateHandle)).getReceivingBrokerageAccountType(), false, null, 12, null), stateProvider, duxoBundle);
        this.imageLoader = imageLoader;
        this.acatsValidationStore = acatsValidationStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        HttpUrl logoUrl = Eithers.getLogoUrl(((AcatsInAccountNumberContract.Key) INSTANCE.getArgs((HasSavedState) this)).getBrokerageOrDtcNumber());
        if (logoUrl != null) {
            this.imageLoader.load(logoUrl).into(this);
        }
    }

    public final void validateAccountNumber(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Companion companion = INSTANCE;
        Single<UiAcatsValidationResponse> singleDoOnSubscribe = this.acatsValidationStore.postAccountNumberValidationRequest(new ApiAcatsAccountNumberValidationRequest(Eithers.getDtcNumber(((AcatsInAccountNumberContract.Key) companion.getArgs((HasSavedState) this)).getBrokerageOrDtcNumber()), accountNumber, ((AcatsInAccountNumberContract.Key) companion.getArgs((HasSavedState) this)).getRhsAccountNumber(), Eithers.getBrokerageNumber(((AcatsInAccountNumberContract.Key) companion.getArgs((HasSavedState) this)).getBrokerageOrDtcNumber()))).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo.validateAccountNumber.1

            /* compiled from: AcatsInAccountNumberDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$validateAccountNumber$1$1", m3645f = "AcatsInAccountNumberDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$validateAccountNumber$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState>, Object> {
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
                public final Object invoke(AcatsInAccountNumberDataState acatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState> continuation) {
                    return ((AnonymousClass1) create(acatsInAccountNumberDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AcatsInAccountNumberDataState.copy$default((AcatsInAccountNumberDataState) this.L$0, null, null, true, null, 11, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                AcatsInAccountNumberDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInAccountNumberDuxo.validateAccountNumber$lambda$0(this.f$0, accountNumber, (UiAcatsValidationResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInAccountNumberDuxo.validateAccountNumber$lambda$1(this.f$0, accountNumber, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAccountNumber$lambda$0(AcatsInAccountNumberDuxo acatsInAccountNumberDuxo, String str, UiAcatsValidationResponse uiAcatsValidationResponse) {
        acatsInAccountNumberDuxo.applyMutation(new AcatsInAccountNumberDuxo2(acatsInAccountNumberDuxo, str, uiAcatsValidationResponse, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAccountNumber$lambda$1(AcatsInAccountNumberDuxo acatsInAccountNumberDuxo, String str, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        acatsInAccountNumberDuxo.applyMutation(new AcatsInAccountNumberDuxo3(t, acatsInAccountNumberDuxo, str, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInAccountNumberDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$onSuccess$1", m3645f = "AcatsInAccountNumberDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$onSuccess$1 */
    static final class C77501 extends ContinuationImpl7 implements Function2<AcatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState>, Object> {
        final /* synthetic */ Drawable $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77501(Drawable drawable, Continuation<? super C77501> continuation) {
            super(2, continuation);
            this.$result = drawable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77501 c77501 = new C77501(this.$result, continuation);
            c77501.L$0 = obj;
            return c77501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAccountNumberDataState acatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState> continuation) {
            return ((C77501) create(acatsInAccountNumberDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAccountNumberDataState.copy$default((AcatsInAccountNumberDataState) this.L$0, null, null, false, Drawables.toBitmap$default(this.$result, 0, 0, null, 7, null), 7, null);
        }
    }

    @Override // com.robinhood.android.rhimage.ImageLoader.Target
    public void onSuccess(Drawable result) {
        if (result != null) {
            applyMutation(new C77501(result, null));
        }
    }

    /* compiled from: AcatsInAccountNumberDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDuxo;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInAccountNumberDuxo, AcatsInAccountNumberContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAccountNumberContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInAccountNumberContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAccountNumberContract.Key getArgs(AcatsInAccountNumberDuxo acatsInAccountNumberDuxo) {
            return (AcatsInAccountNumberContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInAccountNumberDuxo);
        }
    }
}
