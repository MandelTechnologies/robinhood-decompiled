package com.robinhood.android.settings.settings.account.trustedcontact;

import com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.TrustedContactStore;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.utils.Optional;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDataState;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailViewState;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailEvent;", "trustedContactStore", "Lcom/robinhood/librobinhood/data/store/identi/TrustedContactStore;", "stateProvider", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/TrustedContactStore;Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "deleteTrustedContact", "startUpdateFlow", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class TrustedContactDetailDuxo extends BaseDuxo3<TrustedContactDetailDataState, TrustedContactDetailViewState, TrustedContactDetailEvent> {
    public static final int $stable = 8;
    private final TrustedContactStore trustedContactStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactDetailDuxo(TrustedContactStore trustedContactStore, TrustedContactDetailStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new TrustedContactDetailDataState(false, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(trustedContactStore, "trustedContactStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.trustedContactStore = trustedContactStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.trustedContactStore.streamTrustedContact(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactDetailDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(TrustedContactDetailDuxo trustedContactDetailDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        ApiTrustedContact apiTrustedContact = (ApiTrustedContact) optional.component1();
        if (apiTrustedContact != null) {
            trustedContactDetailDuxo.applyMutation(new TrustedContactDetailDuxo3(apiTrustedContact, null));
        }
        return Unit.INSTANCE;
    }

    public final void deleteTrustedContact() {
        Completable completableDoOnSubscribe = this.trustedContactStore.deleteTrustedContact().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo.deleteTrustedContact.1

            /* compiled from: TrustedContactDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$deleteTrustedContact$1$1", m3645f = "TrustedContactDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$deleteTrustedContact$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TrustedContactDetailDataState, Continuation<? super TrustedContactDetailDataState>, Object> {
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
                public final Object invoke(TrustedContactDetailDataState trustedContactDetailDataState, Continuation<? super TrustedContactDetailDataState> continuation) {
                    return ((AnonymousClass1) create(trustedContactDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return TrustedContactDetailDataState.copy$default((TrustedContactDetailDataState) this.L$0, true, null, 2, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                TrustedContactDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrustedContactDetailDuxo.deleteTrustedContact$lambda$2(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactDetailDuxo.deleteTrustedContact$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteTrustedContact$lambda$2(TrustedContactDetailDuxo trustedContactDetailDuxo) {
        trustedContactDetailDuxo.submit(TrustedContactDetailEvent.SuccessfulDelete.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteTrustedContact$lambda$3(TrustedContactDetailDuxo trustedContactDetailDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        trustedContactDetailDuxo.applyMutation(new TrustedContactDetailDuxo2(null));
        trustedContactDetailDuxo.submit(TrustedContactDetailEvent.Error.INSTANCE);
        return Unit.INSTANCE;
    }

    public final void startUpdateFlow() {
        withDataState(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactDetailDuxo.startUpdateFlow$lambda$4(this.f$0, (TrustedContactDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startUpdateFlow$lambda$4(TrustedContactDetailDuxo trustedContactDetailDuxo, TrustedContactDetailDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        trustedContactDetailDuxo.submit(new TrustedContactDetailEvent.StartUpdateFlow(it.getTrustedContact()));
        return Unit.INSTANCE;
    }
}
