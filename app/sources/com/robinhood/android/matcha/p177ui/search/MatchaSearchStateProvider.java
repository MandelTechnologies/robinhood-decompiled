package com.robinhood.android.matcha.p177ui.search;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchViewState2;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchViewState4;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchViewState5;
import com.robinhood.android.store.matcha.MatchaSearchStore;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaSearchUser;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: MatchaSearchStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016Jk\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u001d\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u00120\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010!\u001a\u00020\"H\u0002J\f\u0010#\u001a\u00020$*\u00020%H\u0002¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchViewState;", "<init>", "()V", "reduce", "dataState", "createSearchRows", "", "Lcom/robinhood/android/matcha/ui/search/Row;", "query", "", "searchResponse", "Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;", "emptyStateConnections", "Lcom/robinhood/models/db/matcha/MatchaSearchUser;", "contactSearchResults", "Lcom/robinhood/models/contacts/ReferralContact;", "contactsEnabled", "", "transactors", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "isMultiuserUi", "contactLookupId", "", "(Ljava/lang/String;Lcom/robinhood/android/store/matcha/MatchaSearchStore$SearchResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;ZLjava/lang/Integer;)Ljava/util/List;", "createRows", "toUserRows", "connections", "toContactRows", "(Ljava/util/List;Ljava/lang/Integer;)Ljava/util/List;", "addHeader", "header", "Lcom/robinhood/utils/resource/StringResource;", "toBannerState", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchBannerViewState;", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaSearchStateProvider implements StateProvider<MatchaSearchDataState, MatchaSearchViewState> {
    public static final int $stable = 0;

    /* compiled from: MatchaSearchStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public MatchaSearchViewState reduce(MatchaSearchDataState dataState) {
        MatchaSearchViewState2 bannerState;
        boolean z;
        String displayName;
        MatchaIncentivesSummary incentivesSummary;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<MatchaSearchViewState4> listCreateSearchRows = createSearchRows(dataState.getQuery(), dataState.getSearchResponse(), dataState.getEmptyStateConnections(), dataState.getContactSearchResults(), dataState.getContactsEnabled(), dataState.getTransactors(), dataState.isMultiuserUi(), dataState.getContactLookupId());
        if (!dataState.isMatchaIncentivesExperimentMember() || (incentivesSummary = dataState.getIncentivesSummary()) == null || (bannerState = toBannerState(incentivesSummary)) == null) {
            bannerState = MatchaSearchViewState2.Hidden.INSTANCE;
        }
        MatchaSearchViewState2 matchaSearchViewState2 = bannerState;
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getDirection().ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (dataState.getAmount() != null) {
                listCreateSearchRows = CollectionsKt.plus((Collection) CollectionsKt.listOf(new MatchaSearchViewState4.ShareQr(dataState.getAmount())), (Iterable) listCreateSearchRows);
            }
        }
        List<MatchaSearchViewState4> list = listCreateSearchRows;
        StringResource stringResourceInvoke = null;
        BigDecimal invitedUserIncentiveAmount = (dataState.getIncentivesSummary() == null || dataState.getIncentivesSummary().getInvitedUserIncentiveIsAtMax()) ? null : dataState.getIncentivesSummary().getInvitedUserIncentiveAmount();
        String query = dataState.getQuery();
        if (dataState.isMultiuserUi() && !dataState.getTransactors().isEmpty()) {
            int size = dataState.getTransactors().size();
            stringResourceInvoke = StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C21284R.plurals.matcha_search_toolbar_subtitle, size), Integer.valueOf(size));
        }
        StringResource stringResource = stringResourceInvoke;
        boolean zIsMultiuserUi = dataState.isMultiuserUi();
        List<Transactor> transactors = dataState.getTransactors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactors, 10));
        Iterator it = transactors.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Transactor transactor = (Transactor) next;
            List listTake = CollectionsKt.take(StringsKt.split$default((CharSequence) transactor.getDisplayName(), new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null), i2);
            String str = query;
            ProfileAvatarState avatar = ProfileAvatars.getAvatar(transactor);
            Iterator it2 = it;
            if (listTake.size() == 2 && Character.isLetter(StringsKt.first((CharSequence) listTake.get(1)))) {
                z = false;
                displayName = listTake.get(0) + PlaceholderUtils.XXShortPlaceholderText + StringsKt.first((CharSequence) listTake.get(1)) + ".";
            } else {
                z = false;
                displayName = transactor.getDisplayName();
            }
            Integer selectedTransactorIndex = dataState.getSelectedTransactorIndex();
            arrayList.add(new ProfileTag(avatar, displayName, (selectedTransactorIndex != null && i3 == selectedTransactorIndex.intValue()) ? true : z));
            i3 = i4;
            query = str;
            it = it2;
            i2 = 2;
        }
        return new MatchaSearchViewState(query, zIsMultiuserUi, stringResource, arrayList, list, matchaSearchViewState2, invitedUserIncentiveAmount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    private final List<MatchaSearchViewState4> createSearchRows(String query, MatchaSearchStore.SearchResponse searchResponse, List<MatchaSearchUser> emptyStateConnections, List<ReferralContact> contactSearchResults, Boolean contactsEnabled, List<? extends Transactor> transactors, boolean isMultiuserUi, Integer contactLookupId) {
        if (!StringsKt.isBlank(query)) {
            List<MatchaSearchViewState4> listCreateRows = searchResponse != null ? createRows(searchResponse, transactors, isMultiuserUi) : null;
            List<MatchaSearchViewState4> contactRows = toContactRows(contactSearchResults, contactLookupId);
            if (listCreateRows == null) {
                List<MatchaSearchViewState4> arrayList = contactRows;
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList(5);
                    for (int i = 0; i < 5; i++) {
                        arrayList.add(MatchaSearchViewState4.Placeholder.INSTANCE);
                    }
                }
                return (List) arrayList;
            }
            if (listCreateRows.isEmpty() && contactRows.isEmpty()) {
                return CollectionsKt.listOf(MatchaSearchViewState4.NoResults.INSTANCE);
            }
            return CollectionsKt.plus((Collection) listCreateRows, (Iterable) contactRows);
        }
        List<MatchaSearchUser> list = emptyStateConnections;
        if (!list.isEmpty() && !contactSearchResults.isEmpty()) {
            return CollectionsKt.plus((Collection) toUserRows(emptyStateConnections, true, transactors, isMultiuserUi), (Iterable) toContactRows(contactSearchResults, contactLookupId));
        }
        if (!list.isEmpty()) {
            List<MatchaSearchViewState4> userRows = toUserRows(emptyStateConnections, true, transactors, isMultiuserUi);
            return Intrinsics.areEqual(contactsEnabled, Boolean.FALSE) ? CollectionsKt.plus((Collection<? extends MatchaSearchViewState4.EnableContacts>) userRows, new MatchaSearchViewState4.EnableContacts(false)) : userRows;
        }
        if (!contactSearchResults.isEmpty()) {
            return toContactRows(contactSearchResults, contactLookupId);
        }
        if (Intrinsics.areEqual(contactsEnabled, Boolean.FALSE)) {
            return CollectionsKt.listOf(new MatchaSearchViewState4.EnableContacts(true));
        }
        return CollectionsKt.emptyList();
    }

    private final List<MatchaSearchViewState4> createRows(MatchaSearchStore.SearchResponse searchResponse, List<? extends Transactor> list, boolean z) {
        return CollectionsKt.plus((Collection) toUserRows(searchResponse.getConnections(), true, list, z), (Iterable) toUserRows(searchResponse.getUsers(), false, list, z));
    }

    private final List<MatchaSearchViewState4> toUserRows(List<MatchaSearchUser> list, boolean z, List<? extends Transactor> list2, boolean z2) {
        MatchaSearchViewState5 visible;
        List<MatchaSearchUser> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (MatchaSearchUser matchaSearchUser : list3) {
            if (!z2) {
                visible = MatchaSearchViewState5.Invisible.INSTANCE;
            } else {
                if (!z2) {
                    throw new NoWhenBranchMatchedException();
                }
                List<? extends Transactor> list4 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Transactor) it.next()).getDisplayName());
                }
                visible = new MatchaSearchViewState5.Visible(arrayList2.contains(matchaSearchUser.getName()));
            }
            arrayList.add(new MatchaSearchViewState4.RhUser(matchaSearchUser, z, visible));
        }
        return addHeader(arrayList, StringResource.INSTANCE.invoke(z ? C21284R.string.matcha_search_top_people_header : C21284R.string.matcha_search_rh_header, new Object[0]));
    }

    private final List<MatchaSearchViewState4> toContactRows(List<ReferralContact> list, Integer num) {
        List<ReferralContact> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return addHeader(arrayList, StringResource.INSTANCE.invoke(C21284R.string.matcha_search_contacts_header, new Object[0]));
            }
            ReferralContact referralContact = (ReferralContact) it.next();
            int i = referralContact.contactId;
            if (num != null && i == num.intValue()) {
                z = true;
            }
            arrayList.add(new MatchaSearchViewState4.Contact(referralContact, z));
        }
    }

    private final List<MatchaSearchViewState4> addHeader(List<? extends MatchaSearchViewState4> list, StringResource stringResource) {
        if (!list.isEmpty()) {
            return CollectionsKt.plus((Collection) CollectionsKt.listOf(new MatchaSearchViewState4.Header(stringResource)), (Iterable) list);
        }
        return CollectionsKt.emptyList();
    }

    private final MatchaSearchViewState2 toBannerState(MatchaIncentivesSummary matchaIncentivesSummary) {
        if (matchaIncentivesSummary.getInvitedUserIncentiveIsAtMax()) {
            return MatchaSearchViewState2.Hidden.INSTANCE;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new MatchaSearchViewState2.Visible(companion.invoke(C21284R.string.matcha_search_incentives_banner_text, Money.format$default(Money3.toMoney(matchaIncentivesSummary.getInvitedUserIncentiveMaxAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null)), companion.invoke(C21284R.string.matcha_search_incentives_banner_cta, new Object[0]));
    }
}
