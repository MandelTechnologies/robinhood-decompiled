package com.robinhood.android.rhymigration.p245ui.card;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.rhymigration.p245ui.card.RhyCardDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.api.minerva.ApiSetRhyCardPreference;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/card/RhyCardDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/card/RhyCardViewState;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;)V", "<set-?>", "", "virtualCardFirst", "getVirtualCardFirst", "()Z", "setVirtualCardFirst", "(Z)V", "virtualCardFirst$delegate", "Lkotlin/properties/ReadWriteProperty;", "primaryButtonPreference", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;", "getPrimaryButtonPreference", "()Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;", "secondaryButtonPreference", "getSecondaryButtonPreference", "onPrimaryButtonClicked", "", "onSecondaryButtonClicked", "setCardPreference", "rhyCardPreference", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyCardDuxo extends OldBaseDuxo<RhyCardViewState> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyCardDuxo.class, "virtualCardFirst", "getVirtualCardFirst()Z", 0))};
    public static final int $stable = 8;
    private final MinervaAccountStore store;

    /* renamed from: virtualCardFirst$delegate, reason: from kotlin metadata */
    private final Interfaces3 virtualCardFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyCardDuxo(MinervaAccountStore store) {
        super(new RhyCardViewState(false, false, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
        this.virtualCardFirst = Delegates.INSTANCE.notNull();
    }

    public final boolean getVirtualCardFirst() {
        return ((Boolean) this.virtualCardFirst.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setVirtualCardFirst(boolean z) {
        this.virtualCardFirst.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final MinervaAccountStore.RhyCardPreference getPrimaryButtonPreference() {
        return getVirtualCardFirst() ? MinervaAccountStore.RhyCardPreference.VIRTUAL : MinervaAccountStore.RhyCardPreference.PLASTIC;
    }

    private final MinervaAccountStore.RhyCardPreference getSecondaryButtonPreference() {
        return getVirtualCardFirst() ? MinervaAccountStore.RhyCardPreference.PLASTIC : MinervaAccountStore.RhyCardPreference.VIRTUAL;
    }

    public final void onPrimaryButtonClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyCardDuxo.onPrimaryButtonClicked$lambda$0((RhyCardViewState) obj);
            }
        });
        setCardPreference(getPrimaryButtonPreference());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyCardViewState onPrimaryButtonClicked$lambda$0(RhyCardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyCardViewState.copy$default(applyMutation, true, false, null, null, 14, null);
    }

    public final void onSecondaryButtonClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyCardDuxo.onSecondaryButtonClicked$lambda$1((RhyCardViewState) obj);
            }
        });
        setCardPreference(getSecondaryButtonPreference());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyCardViewState onSecondaryButtonClicked$lambda$1(RhyCardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyCardViewState.copy$default(applyMutation, false, true, null, null, 13, null);
    }

    /* compiled from: RhyCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.card.RhyCardDuxo$setCardPreference$1", m3645f = "RhyCardDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhymigration.ui.card.RhyCardDuxo$setCardPreference$1 */
    static final class C276041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MinervaAccountStore.RhyCardPreference $rhyCardPreference;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C276041(MinervaAccountStore.RhyCardPreference rhyCardPreference, Continuation<? super C276041> continuation) {
            super(2, continuation);
            this.$rhyCardPreference = rhyCardPreference;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C276041 c276041 = RhyCardDuxo.this.new C276041(this.$rhyCardPreference, continuation);
            c276041.L$0 = obj;
            return c276041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C276041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RhyCardDuxo rhyCardDuxo = RhyCardDuxo.this;
                    MinervaAccountStore.RhyCardPreference rhyCardPreference = this.$rhyCardPreference;
                    Result.Companion companion = Result.INSTANCE;
                    MinervaAccountStore minervaAccountStore = rhyCardDuxo.store;
                    this.label = 1;
                    obj = minervaAccountStore.setCardPreference(rhyCardPreference, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiSetRhyCardPreference) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            RhyCardDuxo rhyCardDuxo2 = RhyCardDuxo.this;
            final MinervaAccountStore.RhyCardPreference rhyCardPreference2 = this.$rhyCardPreference;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                rhyCardDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardDuxo$setCardPreference$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RhyCardDuxo.C276041.invokeSuspend$lambda$2$lambda$1(rhyCardPreference2, (RhyCardViewState) obj2);
                    }
                });
            }
            RhyCardDuxo rhyCardDuxo3 = RhyCardDuxo.this;
            final Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                rhyCardDuxo3.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardDuxo$setCardPreference$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RhyCardDuxo.C276041.invokeSuspend$lambda$4$lambda$3(thM28553exceptionOrNullimpl, (RhyCardViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhyCardViewState invokeSuspend$lambda$2$lambda$1(MinervaAccountStore.RhyCardPreference rhyCardPreference, RhyCardViewState rhyCardViewState) {
            return RhyCardViewState.copy$default(rhyCardViewState, false, false, new UiEvent(rhyCardPreference), null, 8, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhyCardViewState invokeSuspend$lambda$4$lambda$3(Throwable th, RhyCardViewState rhyCardViewState) {
            return RhyCardViewState.copy$default(rhyCardViewState, false, false, null, new UiEvent(th), 4, null);
        }
    }

    private final void setCardPreference(MinervaAccountStore.RhyCardPreference rhyCardPreference) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C276041(rhyCardPreference, null), 3, null);
    }
}
