package com.robinhood.p2p.common;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.p320db.matcha.MatchaProfileInfo;
import com.robinhood.models.p320db.matcha.MatchaUser;
import com.robinhood.p2p.common.ProfileAvatarState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ProfileAvatars.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"avatar", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "getAvatar", "(Lcom/robinhood/android/matcha/models/ui/Transactor;)Lcom/robinhood/p2p/common/ProfileAvatarState;", "Lcom/robinhood/models/db/matcha/MatchaUser;", "(Lcom/robinhood/models/db/matcha/MatchaUser;)Lcom/robinhood/p2p/common/ProfileAvatarState;", "Lcom/robinhood/models/contacts/ReferralContact;", "(Lcom/robinhood/models/contacts/ReferralContact;)Lcom/robinhood/p2p/common/ProfileAvatarState;", "initials", "", "getInitials", "(Ljava/lang/String;)Ljava/lang/String;", "lib-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.p2p.common.ProfileAvatarsKt, reason: use source file name */
/* loaded from: classes22.dex */
public final class ProfileAvatars {

    /* compiled from: ProfileAvatars.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.p2p.common.ProfileAvatarsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiMatchaIdentifier2.values().length];
            try {
                iArr[ApiMatchaIdentifier2.USER_UUID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiMatchaIdentifier2.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiMatchaIdentifier2.PHONE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProfileAvatarState getAvatar(Transactor transactor) {
        Intrinsics.checkNotNullParameter(transactor, "<this>");
        if (transactor instanceof Transactor.User) {
            Transactor.User user = (Transactor.User) transactor;
            String profilePicture = user.getUser().getProfilePicture();
            if (profilePicture != null && profilePicture.length() != 0) {
                return new ProfileAvatarState.Image(profilePicture, getInitials(user.getUser().getName()));
            }
            return new ProfileAvatarState.Text(getInitials(user.getUser().getName()));
        }
        if (transactor instanceof Transactor.Email) {
            Transactor.Email email = (Transactor.Email) transactor;
            String contactName = email.getContactName();
            if (contactName != null && contactName.length() != 0) {
                String contactName2 = email.getContactName();
                Intrinsics.checkNotNull(contactName2);
                return new ProfileAvatarState.Text(getInitials(contactName2));
            }
            return ProfileAvatarState.Icon.EMAIL;
        }
        if (!(transactor instanceof Transactor.Phone)) {
            throw new NoWhenBranchMatchedException();
        }
        Transactor.Phone phone = (Transactor.Phone) transactor;
        String contactName3 = phone.getContactName();
        if (contactName3 != null && contactName3.length() != 0 && !StringsKt.equals$default(phone.getContactName(), phone.getPhoneNumber(), false, 2, null)) {
            String contactName4 = phone.getContactName();
            Intrinsics.checkNotNull(contactName4);
            return new ProfileAvatarState.Text(getInitials(contactName4));
        }
        return ProfileAvatarState.Icon.PHONE;
    }

    public static final ProfileAvatarState getAvatar(MatchaUser matchaUser) {
        String fullName;
        Intrinsics.checkNotNullParameter(matchaUser, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[matchaUser.getIdentifier().getType().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return ProfileAvatarState.Icon.SMILEY;
            }
            throw new NoWhenBranchMatchedException();
        }
        MatchaProfileInfo profileInfo = matchaUser.getProfileInfo();
        String initials = null;
        String profilePictureUrl = profileInfo != null ? profileInfo.getProfilePictureUrl() : null;
        MatchaProfileInfo profileInfo2 = matchaUser.getProfileInfo();
        if (profileInfo2 != null && (fullName = profileInfo2.getFullName()) != null) {
            initials = getInitials(fullName);
        }
        return (profilePictureUrl == null || profilePictureUrl.length() == 0) ? (initials == null || initials.length() == 0) ? ProfileAvatarState.Icon.SMILEY : new ProfileAvatarState.Text(initials) : new ProfileAvatarState.Image(profilePictureUrl, initials);
    }

    public static final ProfileAvatarState getAvatar(ReferralContact referralContact) {
        Intrinsics.checkNotNullParameter(referralContact, "<this>");
        String strValidDisplayName = referralContact.validDisplayName();
        return Intrinsics.areEqual(strValidDisplayName, referralContact.phoneNumberForDisplay) ? ProfileAvatarState.Icon.PHONE : Intrinsics.areEqual(strValidDisplayName, referralContact.email) ? ProfileAvatarState.Icon.EMAIL : new ProfileAvatarState.Text(getInitials(referralContact.validDisplayName()));
    }

    private static final String getInitials(String str) {
        return CollectionsKt.joinToString$default(CollectionsKt.take(StringsKt.split$default((CharSequence) str, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null), 2), "", null, null, 0, null, new Function1() { // from class: com.robinhood.p2p.common.ProfileAvatarsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileAvatars._get_initials_$lambda$0((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_initials_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strValueOf = String.valueOf(StringsKt.first(it));
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
