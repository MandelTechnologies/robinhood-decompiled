package com.robinhood.android.matcha.p177ui.search.contactlookup;

import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser2;
import com.robinhood.android.matcha.p177ui.models.UtilsKt;
import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupViewState;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.matcha.MatchaSearchUser;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContactLookupStateProvider.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002J&\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015*\b\u0012\u0004\u0012\u00020\u00120\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDataState;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState;", "<init>", "()V", "reduce", "dataState", "createLoadedState", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "searchResponse", "Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "selectedUserId", "", "createUserNotFoundState", "createUserFoundState", "user", "Lcom/robinhood/models/db/matcha/MatchaSearchUser;", "createMultipleUsersFoundState", "users", "", "toSelectionRows", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$SelectFromMultipleUsers$SelectionRow;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ContactLookupStateProvider implements StateProvider<ContactLookupDataState, ContactLookupViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.StateProvider
    public ContactLookupViewState reduce(ContactLookupDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getSearchResponse() == null) {
            return new ContactLookupViewState.Loading(null, 1, 0 == true ? 1 : 0);
        }
        return createLoadedState(dataState.getTransactor(), dataState.getSearchResponse(), dataState.getSelectedUserId());
    }

    private final ContactLookupViewState createLoadedState(Transactor transactor, MatchaSearchStore.SearchResponse searchResponse, String selectedUserId) {
        List<MatchaSearchUser> listComponent1 = searchResponse.component1();
        List<MatchaSearchUser> listComponent2 = searchResponse.component2();
        if (listComponent1.isEmpty() && listComponent2.isEmpty()) {
            return createUserNotFoundState(transactor);
        }
        if (listComponent1.size() == 1 || listComponent2.size() == 1) {
            MatchaSearchUser matchaSearchUser = (MatchaSearchUser) CollectionsKt.firstOrNull((List) listComponent1);
            if (matchaSearchUser == null) {
                matchaSearchUser = (MatchaSearchUser) CollectionsKt.first((List) listComponent2);
            }
            return createUserFoundState(matchaSearchUser, transactor);
        }
        List<MatchaSearchUser> listPlus = CollectionsKt.plus((Collection) listComponent1, (Iterable) listComponent2);
        if (selectedUserId == null) {
            selectedUserId = ((MatchaSearchUser) CollectionsKt.first((List) listPlus)).getUserId();
        }
        return createMultipleUsersFoundState(listPlus, selectedUserId, transactor);
    }

    private final ContactLookupViewState createUserNotFoundState(Transactor transactor) {
        String phoneNumber;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C21284R.string.contact_lookup_title, new Object[0]);
        StringResource stringResourceInvoke2 = companion.invoke(C21284R.string.contact_lookup_user_not_found_subtitle, new Object[0]);
        String displayName = transactor.getDisplayName();
        if (transactor instanceof Transactor.Email) {
            phoneNumber = transactor.getIdentifier();
        } else {
            if (!(transactor instanceof Transactor.Phone)) {
                if (!(transactor instanceof Transactor.User)) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(transactor);
                throw new ExceptionsH();
            }
            phoneNumber = UtilsKt.formatPhoneNumber(transactor.getIdentifier());
        }
        return new ContactLookupViewState.ConfirmSingleUser(stringResourceInvoke, stringResourceInvoke2, displayName, phoneNumber, ProfileAvatars.getAvatar(transactor), new ContactLookupViewState.Action.ContinueToPay(transactor), ContactLookupViewState.Action.Cancel.INSTANCE, false, null);
    }

    private final ContactLookupViewState createUserFoundState(MatchaSearchUser user, Transactor transactor) {
        Transactor.User user2 = new Transactor.User(UiMatchaUser2.toUiMatchaUser(user), false, 2, null);
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C21284R.string.contact_lookup_title, new Object[0]);
        if ((transactor instanceof Transactor.Phone) || (transactor instanceof Transactor.Email)) {
            return new ContactLookupViewState.ConfirmSingleUser(stringResourceInvoke, companion.invoke(C21284R.string.contact_lookup_user_found_subtitle, new Object[0]), user.getName(), user.getUsername(), ProfileAvatars.getAvatar(user2), new ContactLookupViewState.Action.ContinueToPay(user2), ContactLookupViewState.Action.Cancel.INSTANCE, true, user2);
        }
        if (!(transactor instanceof Transactor.User)) {
            throw new NoWhenBranchMatchedException();
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(transactor);
        throw new ExceptionsH();
    }

    private final ContactLookupViewState createMultipleUsersFoundState(List<MatchaSearchUser> users, String selectedUserId, Transactor transactor) {
        StringResource stringResourceInvoke;
        List<ContactLookupViewState.SelectFromMultipleUsers.SelectionRow> selectionRows = toSelectionRows(users, selectedUserId);
        if (transactor instanceof Transactor.Email) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C21284R.string.contact_email_multiple_accounts_title, new Object[0]);
        } else {
            if (!(transactor instanceof Transactor.Phone)) {
                if (!(transactor instanceof Transactor.User)) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(transactor);
                throw new ExceptionsH();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C21284R.string.contact_phone_multiple_accounts_title, new Object[0]);
        }
        StringResource stringResourceInvoke2 = StringResource.INSTANCE.invoke(C21284R.string.contact_lookup_multiple_users_found_subtitle, new Object[0]);
        for (MatchaSearchUser matchaSearchUser : users) {
            if (Intrinsics.areEqual(matchaSearchUser.getUserId(), selectedUserId)) {
                return new ContactLookupViewState.SelectFromMultipleUsers(selectionRows, stringResourceInvoke, stringResourceInvoke2, new ContactLookupViewState.Action.ContinueToPay(new Transactor.User(UiMatchaUser2.toUiMatchaUser(matchaSearchUser), false, 2, null)), ContactLookupViewState.Action.Cancel.INSTANCE);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final List<ContactLookupViewState.SelectFromMultipleUsers.SelectionRow> toSelectionRows(List<MatchaSearchUser> list, String str) {
        List<MatchaSearchUser> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (MatchaSearchUser matchaSearchUser : list2) {
            arrayList.add(new ContactLookupViewState.SelectFromMultipleUsers.SelectionRow(matchaSearchUser.getUserId(), matchaSearchUser.getName(), matchaSearchUser.getUsername(), ProfileAvatars.getAvatar(new Transactor.User(UiMatchaUser2.toUiMatchaUser(matchaSearchUser), false, 2, null)), Intrinsics.areEqual(matchaSearchUser.getUserId(), str)));
        }
        return arrayList;
    }
}
