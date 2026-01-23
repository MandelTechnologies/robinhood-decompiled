package com.robinhood.android.rhy.referral.contact;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.rhy.contracts.RhyReferralContactListKey;
import com.robinhood.android.rhy.referral.contact.RhyReferralContactListEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.RhyReferralsContactsStore;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RhyReferralContactListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001&B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018 \u0015*\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00170\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDataState;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListViewState;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "contactsStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralsContactsStore;", "stateProvider", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyReferralsContactsStore;Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "isSearchingSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "searchQuerySubject", "Lcom/robinhood/utils/Optional;", "", "pendingShowInviteMoreDialog", "onResume", "", "onStart", "loadContacts", "onSearchStart", "onSearchChange", "query", "onSearchCancel", "onInviteContact", "contact", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactRow;", "onShareLink", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralContactListDuxo extends BaseDuxo3<RhyReferralContactListDataState, RhyReferralContactListViewState, RhyReferralContactListEvent> implements HasSavedState {
    private static final long SEARCH_QUERY_DEBOUNCE = 200;
    private final RhyReferralsContactsStore contactsStore;
    private final BehaviorSubject<Boolean> isSearchingSubject;
    private String pendingShowInviteMoreDialog;
    private final SavedStateHandle savedStateHandle;
    private final BehaviorSubject<Optional<String>> searchQuerySubject;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralContactListDuxo(RhyReferralsContactsStore contactsStore, RhyReferralContactListStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RhyReferralContactListDataState(false, null, null, ((RhyReferralContactListKey) INSTANCE.getArgs(savedStateHandle)).getInviteMessage(), 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contactsStore = contactsStore;
        this.savedStateHandle = savedStateHandle;
        BehaviorSubject<Boolean> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this.isSearchingSubject = behaviorSubjectCreateDefault;
        BehaviorSubject<Optional<String>> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.searchQuerySubject = behaviorSubjectCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        String str = this.pendingShowInviteMoreDialog;
        if (str != null) {
            submit(new RhyReferralContactListEvent.ShowInviteMoreDialog(str));
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.isSearchingSubject, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralContactListDuxo.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        Observable map = ObservablesKt.filterIsPresent(this.searchQuerySubject).debounce(200L, TimeUnit.MILLISECONDS).filter(new Predicate() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Intrinsics.areEqual(RhyReferralContactListDuxo.this.isSearchingSubject.getValue(), Boolean.TRUE);
            }
        }).map(new Function() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final String apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = StringsKt.trim(it).toString();
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = string2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralContactListDuxo.onStart$lambda$2(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyReferralContactListDuxo rhyReferralContactListDuxo, Boolean bool) {
        rhyReferralContactListDuxo.applyMutation(new RhyReferralContactListDuxo3(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(RhyReferralContactListDuxo rhyReferralContactListDuxo, String str) {
        rhyReferralContactListDuxo.applyMutation(new RhyReferralContactListDuxo4(str, null));
        return Unit.INSTANCE;
    }

    public final void loadContacts() {
        this.contactsStore.refresh();
        Observable<List<ReferralContact>> observableOnErrorReturnItem = this.contactsStore.getContacts().onErrorReturnItem(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorReturnItem, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralContactListDuxo.loadContacts$lambda$3(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContacts$lambda$3(RhyReferralContactListDuxo rhyReferralContactListDuxo, List list) {
        Intrinsics.checkNotNull(list);
        rhyReferralContactListDuxo.applyMutation(new RhyReferralContactListDuxo2(CollectionsKt.sorted(list), null));
        return Unit.INSTANCE;
    }

    public final void onSearchStart() {
        this.isSearchingSubject.onNext(Boolean.TRUE);
    }

    public final void onSearchChange(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.searchQuerySubject.onNext(new Some(query));
    }

    public final void onSearchCancel() {
        this.isSearchingSubject.onNext(Boolean.FALSE);
        this.searchQuerySubject.onNext(Optional2.INSTANCE);
        applyMutation(new C274211(null));
    }

    /* compiled from: RhyReferralContactListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$onSearchCancel$1", m3645f = "RhyReferralContactListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$onSearchCancel$1 */
    static final class C274211 extends ContinuationImpl7 implements Function2<RhyReferralContactListDataState, Continuation<? super RhyReferralContactListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C274211(Continuation<? super C274211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C274211 c274211 = new C274211(continuation);
            c274211.L$0 = obj;
            return c274211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralContactListDataState rhyReferralContactListDataState, Continuation<? super RhyReferralContactListDataState> continuation) {
            return ((C274211) create(rhyReferralContactListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyReferralContactListDataState.copy$default((RhyReferralContactListDataState) this.L$0, false, null, null, null, 11, null);
        }
    }

    public final void onInviteContact(final RhyReferralContactRow contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        withDataState(new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralContactListDuxo.onInviteContact$lambda$4(this.f$0, contact, (RhyReferralContactListDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInviteContact$lambda$4(RhyReferralContactListDuxo rhyReferralContactListDuxo, RhyReferralContactRow rhyReferralContactRow, RhyReferralContactListDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyReferralContactListDuxo.submit(new RhyReferralContactListEvent.InviteContact(rhyReferralContactRow, it.getInviteMessage()));
        rhyReferralContactListDuxo.pendingShowInviteMoreDialog = it.getInviteMessage();
        return Unit.INSTANCE;
    }

    public final void onShareLink() {
        withDataState(new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralContactListDuxo.onShareLink$lambda$5(this.f$0, (RhyReferralContactListDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShareLink$lambda$5(RhyReferralContactListDuxo rhyReferralContactListDuxo, RhyReferralContactListDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyReferralContactListDuxo.submit(new RhyReferralContactListEvent.ShareLink(it.getInviteMessage()));
        rhyReferralContactListDuxo.pendingShowInviteMoreDialog = it.getInviteMessage();
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralContactListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDuxo;", "Lcom/robinhood/android/rhy/contracts/RhyReferralContactListKey;", "<init>", "()V", "SEARCH_QUERY_DEBOUNCE", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyReferralContactListDuxo, RhyReferralContactListKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyReferralContactListKey getArgs(SavedStateHandle savedStateHandle) {
            return (RhyReferralContactListKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyReferralContactListKey getArgs(RhyReferralContactListDuxo rhyReferralContactListDuxo) {
            return (RhyReferralContactListKey) DuxoCompanion.DefaultImpls.getArgs(this, rhyReferralContactListDuxo);
        }
    }
}
