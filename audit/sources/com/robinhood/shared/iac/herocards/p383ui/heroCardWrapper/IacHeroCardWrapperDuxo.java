package com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailDuxo;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.ApiIacHeroCardLocationArg;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.shared.data.store.iac.IacHeroCardStore;
import com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper.IacHeroCardWrapperEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IacHeroCardWrapperDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0019\u001aB!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperViewState;", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo$IacHeroCardWrapperArgs;", "iacHeroCardStore", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onCardDismissClicked", InstrumentDetailDuxo.KEY_IAC_HERO_CARD, "Lcom/robinhood/models/db/herocard/IacHeroCard;", "onCardDismissed", "hasCardBeenDismissedInDuxo", "", "markAsDismissedInDuxo", "IacHeroCardWrapperArgs", "Companion", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class IacHeroCardWrapperDuxo extends BaseDuxo5<IacHeroCardWrapperViewState, IacHeroCardWrapperEvent> implements HasArgs<IacHeroCardWrapperArgs> {
    public static final String KEY_IAC_HERO_CARD_DISMISSED_DEFAULT = "iacHeroCard-dismissed-default";
    public static final String KEY_IAC_HERO_CARD_DISMISSED_MAP = "iacHeroCard-dismissed-map";
    private final IacHeroCardStore iacHeroCardStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public IacHeroCardWrapperArgs getArgs(SavedStateHandle savedStateHandle) {
        return (IacHeroCardWrapperArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacHeroCardWrapperDuxo(IacHeroCardStore iacHeroCardStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new IacHeroCardWrapperViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.iacHeroCardStore = iacHeroCardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C390601(null));
    }

    /* compiled from: IacHeroCardWrapperDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperDuxo$onCreate$1", m3645f = "IacHeroCardWrapperDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperDuxo$onCreate$1 */
    static final class C390601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C390601(Continuation<? super C390601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacHeroCardWrapperDuxo.this.new C390601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C390601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacHeroCardStore iacHeroCardStore = IacHeroCardWrapperDuxo.this.iacHeroCardStore;
                ApiIacHeroCardLocationArg locationArg = ((IacHeroCardWrapperArgs) IacHeroCardWrapperDuxo.INSTANCE.getArgs((HasArgs) IacHeroCardWrapperDuxo.this)).getLocationArg();
                this.label = 1;
                obj = iacHeroCardStore.getIacHeroCard(locationArg, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            IacHeroCard iacHeroCard = (IacHeroCard) obj;
            if (!IacHeroCardWrapperDuxo.this.hasCardBeenDismissedInDuxo(iacHeroCard)) {
                IacHeroCardWrapperDuxo.this.submit(new IacHeroCardWrapperEvent.OnCardLoadingCompleted(iacHeroCard));
                IacHeroCardWrapperDuxo.this.applyMutation(new AnonymousClass1(iacHeroCard, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: IacHeroCardWrapperDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperDuxo$onCreate$1$1", m3645f = "IacHeroCardWrapperDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IacHeroCardWrapperViewState, Continuation<? super IacHeroCardWrapperViewState>, Object> {
            final /* synthetic */ IacHeroCard $iacHeroCard;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IacHeroCard iacHeroCard, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$iacHeroCard = iacHeroCard;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$iacHeroCard, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IacHeroCardWrapperViewState iacHeroCardWrapperViewState, Continuation<? super IacHeroCardWrapperViewState> continuation) {
                return ((AnonymousClass1) create(iacHeroCardWrapperViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((IacHeroCardWrapperViewState) this.L$0).copy(this.$iacHeroCard);
            }
        }
    }

    public final void onCardDismissClicked(IacHeroCard iacHeroCard) {
        Intrinsics.checkNotNullParameter(iacHeroCard, "iacHeroCard");
        markAsDismissedInDuxo(iacHeroCard);
    }

    /* compiled from: IacHeroCardWrapperDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperDuxo$onCardDismissed$1", m3645f = "IacHeroCardWrapperDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.iac.herocards.ui.heroCardWrapper.IacHeroCardWrapperDuxo$onCardDismissed$1 */
    static final class C390591 extends ContinuationImpl7 implements Function2<IacHeroCardWrapperViewState, Continuation<? super IacHeroCardWrapperViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C390591(Continuation<? super C390591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C390591 c390591 = new C390591(continuation);
            c390591.L$0 = obj;
            return c390591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IacHeroCardWrapperViewState iacHeroCardWrapperViewState, Continuation<? super IacHeroCardWrapperViewState> continuation) {
            return ((C390591) create(iacHeroCardWrapperViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((IacHeroCardWrapperViewState) this.L$0).copy(null);
        }
    }

    public final void onCardDismissed() {
        applyMutation(new C390591(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasCardBeenDismissedInDuxo(IacHeroCard iacHeroCard) {
        Boolean bool;
        if (iacHeroCard == null) {
            return false;
        }
        HashMap map = (HashMap) getSavedStateHandle().get(KEY_IAC_HERO_CARD_DISMISSED_MAP);
        if (map == null) {
            map = new HashMap();
        }
        String cardIdentifier = iacHeroCard.getCardIdentifier();
        if (cardIdentifier == null || (bool = (Boolean) map.get(cardIdentifier)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final void markAsDismissedInDuxo(IacHeroCard iacHeroCard) {
        HashMap map = (HashMap) getSavedStateHandle().get(KEY_IAC_HERO_CARD_DISMISSED_MAP);
        if (map == null) {
            map = new HashMap();
        }
        String cardIdentifier = iacHeroCard.getCardIdentifier();
        if (cardIdentifier == null) {
            cardIdentifier = KEY_IAC_HERO_CARD_DISMISSED_DEFAULT;
        }
        map.put(cardIdentifier, Boolean.TRUE);
        getSavedStateHandle().set(KEY_IAC_HERO_CARD_DISMISSED_MAP, map);
    }

    /* compiled from: IacHeroCardWrapperDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo$IacHeroCardWrapperArgs;", "Landroid/os/Parcelable;", "locationArg", "Lcom/robinhood/models/api/ApiIacHeroCardLocationArg;", "<init>", "(Lcom/robinhood/models/api/ApiIacHeroCardLocationArg;)V", "getLocationArg", "()Lcom/robinhood/models/api/ApiIacHeroCardLocationArg;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IacHeroCardWrapperArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<IacHeroCardWrapperArgs> CREATOR = new Creator();
        private final ApiIacHeroCardLocationArg locationArg;

        /* compiled from: IacHeroCardWrapperDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IacHeroCardWrapperArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IacHeroCardWrapperArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IacHeroCardWrapperArgs((ApiIacHeroCardLocationArg) parcel.readParcelable(IacHeroCardWrapperArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IacHeroCardWrapperArgs[] newArray(int i) {
                return new IacHeroCardWrapperArgs[i];
            }
        }

        public static /* synthetic */ IacHeroCardWrapperArgs copy$default(IacHeroCardWrapperArgs iacHeroCardWrapperArgs, ApiIacHeroCardLocationArg apiIacHeroCardLocationArg, int i, Object obj) {
            if ((i & 1) != 0) {
                apiIacHeroCardLocationArg = iacHeroCardWrapperArgs.locationArg;
            }
            return iacHeroCardWrapperArgs.copy(apiIacHeroCardLocationArg);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIacHeroCardLocationArg getLocationArg() {
            return this.locationArg;
        }

        public final IacHeroCardWrapperArgs copy(ApiIacHeroCardLocationArg locationArg) {
            Intrinsics.checkNotNullParameter(locationArg, "locationArg");
            return new IacHeroCardWrapperArgs(locationArg);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IacHeroCardWrapperArgs) && Intrinsics.areEqual(this.locationArg, ((IacHeroCardWrapperArgs) other).locationArg);
        }

        public int hashCode() {
            return this.locationArg.hashCode();
        }

        public String toString() {
            return "IacHeroCardWrapperArgs(locationArg=" + this.locationArg + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.locationArg, flags);
        }

        public IacHeroCardWrapperArgs(ApiIacHeroCardLocationArg locationArg) {
            Intrinsics.checkNotNullParameter(locationArg, "locationArg");
            this.locationArg = locationArg;
        }

        public final ApiIacHeroCardLocationArg getLocationArg() {
            return this.locationArg;
        }
    }

    /* compiled from: IacHeroCardWrapperDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo;", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperDuxo$IacHeroCardWrapperArgs;", "<init>", "()V", "KEY_IAC_HERO_CARD_DISMISSED_MAP", "", "KEY_IAC_HERO_CARD_DISMISSED_DEFAULT", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<IacHeroCardWrapperDuxo, IacHeroCardWrapperArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public IacHeroCardWrapperArgs getArgs(SavedStateHandle savedStateHandle) {
            return (IacHeroCardWrapperArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public IacHeroCardWrapperArgs getArgs(IacHeroCardWrapperDuxo iacHeroCardWrapperDuxo) {
            return (IacHeroCardWrapperArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, iacHeroCardWrapperDuxo);
        }
    }
}
