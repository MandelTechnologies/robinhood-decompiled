package com.robinhood.android.matcha.p177ui.search.contactlookup;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ContactLookupViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState;", "", "Loading", "ConfirmSingleUser", "SelectFromMultipleUsers", "Action", "Companion", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$ConfirmSingleUser;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Loading;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$SelectFromMultipleUsers;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface ContactLookupViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ContactLookupViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Loading;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState;", "mock", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$ConfirmSingleUser;", "<init>", "(Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$ConfirmSingleUser;)V", "getMock", "()Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$ConfirmSingleUser;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ContactLookupViewState {
        public static final int $stable = 8;
        private final ConfirmSingleUser mock;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, ConfirmSingleUser confirmSingleUser, int i, Object obj) {
            if ((i & 1) != 0) {
                confirmSingleUser = loading.mock;
            }
            return loading.copy(confirmSingleUser);
        }

        /* renamed from: component1, reason: from getter */
        public final ConfirmSingleUser getMock() {
            return this.mock;
        }

        public final Loading copy(ConfirmSingleUser mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            return new Loading(mock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.mock, ((Loading) other).mock);
        }

        public int hashCode() {
            return this.mock.hashCode();
        }

        public String toString() {
            return "Loading(mock=" + this.mock + ")";
        }

        public Loading(ConfirmSingleUser mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            this.mock = mock;
        }

        public /* synthetic */ Loading(ConfirmSingleUser confirmSingleUser, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Companion.loadingMock : confirmSingleUser);
        }

        public final ConfirmSingleUser getMock() {
            return this.mock;
        }
    }

    /* compiled from: ContactLookupViewState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Je\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$ConfirmSingleUser;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "name", "", "identifier", "avatarState", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "primaryAction", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "secondaryAction", "showInfoIcon", "", "user", "Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/p2p/common/ProfileAvatarState;Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;ZLcom/robinhood/android/matcha/models/ui/Transactor$User;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getName", "()Ljava/lang/String;", "getIdentifier", "getAvatarState", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "getPrimaryAction", "()Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "getSecondaryAction", "getShowInfoIcon", "()Z", "getUser", "()Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ConfirmSingleUser implements ContactLookupViewState {
        public static final int $stable = 8;
        private final ProfileAvatarState avatarState;
        private final String identifier;
        private final String name;
        private final Action primaryAction;
        private final Action secondaryAction;
        private final boolean showInfoIcon;
        private final StringResource subtitle;
        private final StringResource title;
        private final Transactor.User user;

        public static /* synthetic */ ConfirmSingleUser copy$default(ConfirmSingleUser confirmSingleUser, StringResource stringResource, StringResource stringResource2, String str, String str2, ProfileAvatarState profileAvatarState, Action action, Action action2, boolean z, Transactor.User user, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = confirmSingleUser.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = confirmSingleUser.subtitle;
            }
            if ((i & 4) != 0) {
                str = confirmSingleUser.name;
            }
            if ((i & 8) != 0) {
                str2 = confirmSingleUser.identifier;
            }
            if ((i & 16) != 0) {
                profileAvatarState = confirmSingleUser.avatarState;
            }
            if ((i & 32) != 0) {
                action = confirmSingleUser.primaryAction;
            }
            if ((i & 64) != 0) {
                action2 = confirmSingleUser.secondaryAction;
            }
            if ((i & 128) != 0) {
                z = confirmSingleUser.showInfoIcon;
            }
            if ((i & 256) != 0) {
                user = confirmSingleUser.user;
            }
            boolean z2 = z;
            Transactor.User user2 = user;
            Action action3 = action;
            Action action4 = action2;
            ProfileAvatarState profileAvatarState2 = profileAvatarState;
            String str3 = str;
            return confirmSingleUser.copy(stringResource, stringResource2, str3, str2, profileAvatarState2, action3, action4, z2, user2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component5, reason: from getter */
        public final ProfileAvatarState getAvatarState() {
            return this.avatarState;
        }

        /* renamed from: component6, reason: from getter */
        public final Action getPrimaryAction() {
            return this.primaryAction;
        }

        /* renamed from: component7, reason: from getter */
        public final Action getSecondaryAction() {
            return this.secondaryAction;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowInfoIcon() {
            return this.showInfoIcon;
        }

        /* renamed from: component9, reason: from getter */
        public final Transactor.User getUser() {
            return this.user;
        }

        public final ConfirmSingleUser copy(StringResource title, StringResource subtitle, String name, String identifier, ProfileAvatarState avatarState, Action primaryAction, Action secondaryAction, boolean showInfoIcon, Transactor.User user) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(avatarState, "avatarState");
            Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
            Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
            return new ConfirmSingleUser(title, subtitle, name, identifier, avatarState, primaryAction, secondaryAction, showInfoIcon, user);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmSingleUser)) {
                return false;
            }
            ConfirmSingleUser confirmSingleUser = (ConfirmSingleUser) other;
            return Intrinsics.areEqual(this.title, confirmSingleUser.title) && Intrinsics.areEqual(this.subtitle, confirmSingleUser.subtitle) && Intrinsics.areEqual(this.name, confirmSingleUser.name) && Intrinsics.areEqual(this.identifier, confirmSingleUser.identifier) && Intrinsics.areEqual(this.avatarState, confirmSingleUser.avatarState) && Intrinsics.areEqual(this.primaryAction, confirmSingleUser.primaryAction) && Intrinsics.areEqual(this.secondaryAction, confirmSingleUser.secondaryAction) && this.showInfoIcon == confirmSingleUser.showInfoIcon && Intrinsics.areEqual(this.user, confirmSingleUser.user);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.name.hashCode()) * 31) + this.identifier.hashCode()) * 31) + this.avatarState.hashCode()) * 31) + this.primaryAction.hashCode()) * 31) + this.secondaryAction.hashCode()) * 31) + Boolean.hashCode(this.showInfoIcon)) * 31;
            Transactor.User user = this.user;
            return iHashCode + (user == null ? 0 : user.hashCode());
        }

        public String toString() {
            return "ConfirmSingleUser(title=" + this.title + ", subtitle=" + this.subtitle + ", name=" + this.name + ", identifier=" + this.identifier + ", avatarState=" + this.avatarState + ", primaryAction=" + this.primaryAction + ", secondaryAction=" + this.secondaryAction + ", showInfoIcon=" + this.showInfoIcon + ", user=" + this.user + ")";
        }

        public ConfirmSingleUser(StringResource title, StringResource subtitle, String name, String identifier, ProfileAvatarState avatarState, Action primaryAction, Action secondaryAction, boolean z, Transactor.User user) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(avatarState, "avatarState");
            Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
            Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
            this.title = title;
            this.subtitle = subtitle;
            this.name = name;
            this.identifier = identifier;
            this.avatarState = avatarState;
            this.primaryAction = primaryAction;
            this.secondaryAction = secondaryAction;
            this.showInfoIcon = z;
            this.user = user;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final String getName() {
            return this.name;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final ProfileAvatarState getAvatarState() {
            return this.avatarState;
        }

        public final Action getPrimaryAction() {
            return this.primaryAction;
        }

        public final Action getSecondaryAction() {
            return this.secondaryAction;
        }

        public final boolean getShowInfoIcon() {
            return this.showInfoIcon;
        }

        public final Transactor.User getUser() {
            return this.user;
        }
    }

    /* compiled from: ContactLookupViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$SelectFromMultipleUsers;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState;", "selectionRows", "", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$SelectFromMultipleUsers$SelectionRow;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "primaryAction", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "secondaryAction", "<init>", "(Ljava/util/List;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;)V", "getSelectionRows", "()Ljava/util/List;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getPrimaryAction", "()Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "getSecondaryAction", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", EquityOrderFormRowState2.SelectionRowTestTag, "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectFromMultipleUsers implements ContactLookupViewState {
        public static final int $stable = 8;
        private final Action primaryAction;
        private final Action secondaryAction;
        private final List<SelectionRow> selectionRows;
        private final StringResource subtitle;
        private final StringResource title;

        public static /* synthetic */ SelectFromMultipleUsers copy$default(SelectFromMultipleUsers selectFromMultipleUsers, List list, StringResource stringResource, StringResource stringResource2, Action action, Action action2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = selectFromMultipleUsers.selectionRows;
            }
            if ((i & 2) != 0) {
                stringResource = selectFromMultipleUsers.title;
            }
            if ((i & 4) != 0) {
                stringResource2 = selectFromMultipleUsers.subtitle;
            }
            if ((i & 8) != 0) {
                action = selectFromMultipleUsers.primaryAction;
            }
            if ((i & 16) != 0) {
                action2 = selectFromMultipleUsers.secondaryAction;
            }
            Action action3 = action2;
            StringResource stringResource3 = stringResource2;
            return selectFromMultipleUsers.copy(list, stringResource, stringResource3, action, action3);
        }

        public final List<SelectionRow> component1() {
            return this.selectionRows;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final Action getPrimaryAction() {
            return this.primaryAction;
        }

        /* renamed from: component5, reason: from getter */
        public final Action getSecondaryAction() {
            return this.secondaryAction;
        }

        public final SelectFromMultipleUsers copy(List<SelectionRow> selectionRows, StringResource title, StringResource subtitle, Action primaryAction, Action secondaryAction) {
            Intrinsics.checkNotNullParameter(selectionRows, "selectionRows");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
            Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
            return new SelectFromMultipleUsers(selectionRows, title, subtitle, primaryAction, secondaryAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectFromMultipleUsers)) {
                return false;
            }
            SelectFromMultipleUsers selectFromMultipleUsers = (SelectFromMultipleUsers) other;
            return Intrinsics.areEqual(this.selectionRows, selectFromMultipleUsers.selectionRows) && Intrinsics.areEqual(this.title, selectFromMultipleUsers.title) && Intrinsics.areEqual(this.subtitle, selectFromMultipleUsers.subtitle) && Intrinsics.areEqual(this.primaryAction, selectFromMultipleUsers.primaryAction) && Intrinsics.areEqual(this.secondaryAction, selectFromMultipleUsers.secondaryAction);
        }

        public int hashCode() {
            return (((((((this.selectionRows.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.primaryAction.hashCode()) * 31) + this.secondaryAction.hashCode();
        }

        public String toString() {
            return "SelectFromMultipleUsers(selectionRows=" + this.selectionRows + ", title=" + this.title + ", subtitle=" + this.subtitle + ", primaryAction=" + this.primaryAction + ", secondaryAction=" + this.secondaryAction + ")";
        }

        public SelectFromMultipleUsers(List<SelectionRow> selectionRows, StringResource title, StringResource subtitle, Action primaryAction, Action secondaryAction) {
            Intrinsics.checkNotNullParameter(selectionRows, "selectionRows");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
            Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
            this.selectionRows = selectionRows;
            this.title = title;
            this.subtitle = subtitle;
            this.primaryAction = primaryAction;
            this.secondaryAction = secondaryAction;
        }

        public final List<SelectionRow> getSelectionRows() {
            return this.selectionRows;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final Action getPrimaryAction() {
            return this.primaryAction;
        }

        public final Action getSecondaryAction() {
            return this.secondaryAction;
        }

        /* compiled from: ContactLookupViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$SelectFromMultipleUsers$SelectionRow;", "", "id", "", "primaryText", "secondaryText", "avatarState", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/p2p/common/ProfileAvatarState;Z)V", "getId", "()Ljava/lang/String;", "getPrimaryText", "getSecondaryText", "getAvatarState", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelectionRow {
            public static final int $stable = 8;
            private final ProfileAvatarState avatarState;
            private final String id;
            private final String primaryText;
            private final String secondaryText;
            private final boolean selected;

            public static /* synthetic */ SelectionRow copy$default(SelectionRow selectionRow, String str, String str2, String str3, ProfileAvatarState profileAvatarState, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = selectionRow.id;
                }
                if ((i & 2) != 0) {
                    str2 = selectionRow.primaryText;
                }
                if ((i & 4) != 0) {
                    str3 = selectionRow.secondaryText;
                }
                if ((i & 8) != 0) {
                    profileAvatarState = selectionRow.avatarState;
                }
                if ((i & 16) != 0) {
                    z = selectionRow.selected;
                }
                boolean z2 = z;
                String str4 = str3;
                return selectionRow.copy(str, str2, str4, profileAvatarState, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPrimaryText() {
                return this.primaryText;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSecondaryText() {
                return this.secondaryText;
            }

            /* renamed from: component4, reason: from getter */
            public final ProfileAvatarState getAvatarState() {
                return this.avatarState;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            public final SelectionRow copy(String id, String primaryText, String secondaryText, ProfileAvatarState avatarState, boolean selected) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
                Intrinsics.checkNotNullParameter(avatarState, "avatarState");
                return new SelectionRow(id, primaryText, secondaryText, avatarState, selected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectionRow)) {
                    return false;
                }
                SelectionRow selectionRow = (SelectionRow) other;
                return Intrinsics.areEqual(this.id, selectionRow.id) && Intrinsics.areEqual(this.primaryText, selectionRow.primaryText) && Intrinsics.areEqual(this.secondaryText, selectionRow.secondaryText) && Intrinsics.areEqual(this.avatarState, selectionRow.avatarState) && this.selected == selectionRow.selected;
            }

            public int hashCode() {
                return (((((((this.id.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.avatarState.hashCode()) * 31) + Boolean.hashCode(this.selected);
            }

            public String toString() {
                return "SelectionRow(id=" + this.id + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", avatarState=" + this.avatarState + ", selected=" + this.selected + ")";
            }

            public SelectionRow(String id, String primaryText, String secondaryText, ProfileAvatarState avatarState, boolean z) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(primaryText, "primaryText");
                Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
                Intrinsics.checkNotNullParameter(avatarState, "avatarState");
                this.id = id;
                this.primaryText = primaryText;
                this.secondaryText = secondaryText;
                this.avatarState = avatarState;
                this.selected = z;
            }

            public final String getId() {
                return this.id;
            }

            public final String getPrimaryText() {
                return this.primaryText;
            }

            public final String getSecondaryText() {
                return this.secondaryText;
            }

            public final ProfileAvatarState getAvatarState() {
                return this.avatarState;
            }

            public final boolean getSelected() {
                return this.selected;
            }
        }
    }

    /* compiled from: ContactLookupViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", AnnotatedPrivateKey.LABEL, "", "getLabel", "()I", "ContinueToPay", "PayByEmail", "PayByText", "Cancel", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$Cancel;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$ContinueToPay;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$PayByEmail;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$PayByText;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Action {
        int getLabel();

        Transactor getTransactor();

        /* compiled from: ContactLookupViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$ContinueToPay;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Lcom/robinhood/android/matcha/models/ui/Transactor;)V", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", AnnotatedPrivateKey.LABEL, "", "getLabel", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContinueToPay implements Action {
            public static final int $stable = 8;
            private final int label;
            private final Transactor transactor;

            public static /* synthetic */ ContinueToPay copy$default(ContinueToPay continueToPay, Transactor transactor, int i, Object obj) {
                if ((i & 1) != 0) {
                    transactor = continueToPay.transactor;
                }
                return continueToPay.copy(transactor);
            }

            /* renamed from: component1, reason: from getter */
            public final Transactor getTransactor() {
                return this.transactor;
            }

            public final ContinueToPay copy(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                return new ContinueToPay(transactor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContinueToPay) && Intrinsics.areEqual(this.transactor, ((ContinueToPay) other).transactor);
            }

            public int hashCode() {
                return this.transactor.hashCode();
            }

            public String toString() {
                return "ContinueToPay(transactor=" + this.transactor + ")";
            }

            public ContinueToPay(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                this.transactor = transactor;
                this.label = C11048R.string.general_label_continue;
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public Transactor getTransactor() {
                return this.transactor;
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public int getLabel() {
                return this.label;
            }
        }

        /* compiled from: ContactLookupViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$PayByEmail;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Lcom/robinhood/android/matcha/models/ui/Transactor;)V", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", AnnotatedPrivateKey.LABEL, "", "getLabel", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PayByEmail implements Action {
            public static final int $stable = 8;
            private final int label;
            private final Transactor transactor;

            public static /* synthetic */ PayByEmail copy$default(PayByEmail payByEmail, Transactor transactor, int i, Object obj) {
                if ((i & 1) != 0) {
                    transactor = payByEmail.transactor;
                }
                return payByEmail.copy(transactor);
            }

            /* renamed from: component1, reason: from getter */
            public final Transactor getTransactor() {
                return this.transactor;
            }

            public final PayByEmail copy(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                return new PayByEmail(transactor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PayByEmail) && Intrinsics.areEqual(this.transactor, ((PayByEmail) other).transactor);
            }

            public int hashCode() {
                return this.transactor.hashCode();
            }

            public String toString() {
                return "PayByEmail(transactor=" + this.transactor + ")";
            }

            public PayByEmail(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                this.transactor = transactor;
                this.label = C21284R.string.contact_lookup_pay_by_email;
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public Transactor getTransactor() {
                return this.transactor;
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public int getLabel() {
                return this.label;
            }
        }

        /* compiled from: ContactLookupViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$PayByText;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Lcom/robinhood/android/matcha/models/ui/Transactor;)V", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", AnnotatedPrivateKey.LABEL, "", "getLabel", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PayByText implements Action {
            public static final int $stable = 8;
            private final int label;
            private final Transactor transactor;

            public static /* synthetic */ PayByText copy$default(PayByText payByText, Transactor transactor, int i, Object obj) {
                if ((i & 1) != 0) {
                    transactor = payByText.transactor;
                }
                return payByText.copy(transactor);
            }

            /* renamed from: component1, reason: from getter */
            public final Transactor getTransactor() {
                return this.transactor;
            }

            public final PayByText copy(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                return new PayByText(transactor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PayByText) && Intrinsics.areEqual(this.transactor, ((PayByText) other).transactor);
            }

            public int hashCode() {
                return this.transactor.hashCode();
            }

            public String toString() {
                return "PayByText(transactor=" + this.transactor + ")";
            }

            public PayByText(Transactor transactor) {
                Intrinsics.checkNotNullParameter(transactor, "transactor");
                this.transactor = transactor;
                this.label = C21284R.string.contact_lookup_pay_by_text;
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public Transactor getTransactor() {
                return this.transactor;
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public int getLabel() {
                return this.label;
            }
        }

        /* compiled from: ContactLookupViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action$Cancel;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "<init>", "()V", "transactor", "", "getTransactor", "()Ljava/lang/Void;", AnnotatedPrivateKey.LABEL, "", "getLabel", "()I", "equals", "", "other", "", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Cancel implements Action {
            private static final Void transactor = null;
            public static final Cancel INSTANCE = new Cancel();
            private static final int label = C11048R.string.general_label_cancel;
            public static final int $stable = 8;

            public boolean equals(Object other) {
                return this == other || (other instanceof Cancel);
            }

            public int hashCode() {
                return -1936150444;
            }

            public String toString() {
                return "Cancel";
            }

            private Cancel() {
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public /* bridge */ /* synthetic */ Transactor getTransactor() {
                return (Transactor) m16446getTransactor();
            }

            /* renamed from: getTransactor, reason: collision with other method in class */
            public Void m16446getTransactor() {
                return transactor;
            }

            @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupViewState.Action
            public int getLabel() {
                return label;
            }
        }
    }

    /* compiled from: ContactLookupViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Companion;", "", "<init>", "()V", "userTransactor", "Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "loadingMock", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$ConfirmSingleUser;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ConfirmSingleUser loadingMock;
        private static final Transactor.User userTransactor;

        private Companion() {
        }

        static {
            Transactor.User user = new Transactor.User(new UiMatchaUser(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, "-----", "----- --- ---", null), true);
            userTransactor = user;
            StringResource.Companion companion = StringResource.INSTANCE;
            loadingMock = new ConfirmSingleUser(companion.invoke("-- --- ---- -- --- ---- -------"), companion.invoke(StringsKt.repeat("-", 70)), user.getUser().getName(), "-----", ProfileAvatarState.Icon.PHONE, new Action.ContinueToPay(user), Action.Cancel.INSTANCE, true, user);
        }
    }
}
