package com.robinhood.android.matcha.p177ui.search.contactlookup;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupBottomSheet;
import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupEvent;
import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupViewState;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
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

/* compiled from: ContactLookupDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDataState;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "searchStore", "Lcom/robinhood/android/store/matcha/MatchaSearchStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupStateProvider;", "<init>", "(Lcom/robinhood/android/store/matcha/MatchaSearchStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "setSelectedUserId", "userId", "", "launchUserProfile", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ContactLookupDuxo extends BaseDuxo3<ContactLookupDataState, ContactLookupViewState, ContactLookupEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final MatchaSearchStore searchStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactLookupDuxo(MatchaSearchStore searchStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ContactLookupStateProvider stateProvider) {
        super(new ContactLookupDataState(((ContactLookupBottomSheet.Args) INSTANCE.getArgs(savedStateHandle)).getContact(), null, null, 6, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.searchStore = searchStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.searchStore.search(((ContactLookupBottomSheet.Args) INSTANCE.getArgs((HasSavedState) this)).getContact().getIdentifier()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactLookupDuxo.onStart$lambda$0(this.f$0, (MatchaSearchStore.SearchResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactLookupDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(ContactLookupDuxo contactLookupDuxo, MatchaSearchStore.SearchResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        contactLookupDuxo.applyMutation(new ContactLookupDuxo2(it, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(ContactLookupDuxo contactLookupDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        contactLookupDuxo.submit(new ContactLookupEvent.Error(it));
        return Unit.INSTANCE;
    }

    /* compiled from: ContactLookupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupDuxo$setSelectedUserId$1", m3645f = "ContactLookupDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupDuxo$setSelectedUserId$1 */
    static final class C215641 extends ContinuationImpl7 implements Function2<ContactLookupDataState, Continuation<? super ContactLookupDataState>, Object> {
        final /* synthetic */ String $userId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215641(String str, Continuation<? super C215641> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215641 c215641 = new C215641(this.$userId, continuation);
            c215641.L$0 = obj;
            return c215641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ContactLookupDataState contactLookupDataState, Continuation<? super ContactLookupDataState> continuation) {
            return ((C215641) create(contactLookupDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContactLookupDataState.copy$default((ContactLookupDataState) this.L$0, null, null, this.$userId, 3, null);
        }
    }

    public final void setSelectedUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        applyMutation(new C215641(userId, null));
    }

    public final void launchUserProfile() {
        ContactLookupViewState value = getStateFlow().getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.ConfirmSingleUser");
        Transactor.User user = ((ContactLookupViewState.ConfirmSingleUser) value).getUser();
        Intrinsics.checkNotNull(user);
        submit(new ContactLookupEvent.LaunchProfile(user));
    }

    /* compiled from: ContactLookupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDuxo;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupBottomSheet$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ContactLookupDuxo, ContactLookupBottomSheet.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ContactLookupBottomSheet.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ContactLookupBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ContactLookupBottomSheet.Args getArgs(ContactLookupDuxo contactLookupDuxo) {
            return (ContactLookupBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, contactLookupDuxo);
        }
    }
}
