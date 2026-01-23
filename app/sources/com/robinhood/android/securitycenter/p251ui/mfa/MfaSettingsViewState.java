package com.robinhood.android.securitycenter.p251ui.mfa;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.util.extensions.PhoneFormat;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.Mfa;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MfaSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u00018BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÂ\u0003J\t\u00101\u001a\u00020\fHÂ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÂ\u0003JU\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u001aHÖ\u0001J\t\u00107\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState;", "", "subtitleText", "", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "mfa", "Lcom/robinhood/models/api/Mfa;", "phoneNumber", "", "isRhcApp", "", "user", "Lcom/robinhood/models/db/sheriff/User;", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/Mfa;Ljava/lang/String;ZLcom/robinhood/models/db/sheriff/User;)V", "getSubtitleText", "()Ljava/lang/CharSequence;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "isLoading", "()Z", "isCurrentMethodVisible", "isChangeMethodVisible", "changeMethodTitleRes", "", "getChangeMethodTitleRes", "()I", "currentMethodsList", "", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod;", "getCurrentMethodsList$feature_security_center_externalDebug", "()Ljava/util/List;", "currentMfaMethodsList", "getCurrentMfaMethodsList", "changeMethodsList", "getChangeMethodsList$feature_security_center_externalDebug", "mfaMethods", "getMfaMethods", "smsSubtitleRes", "Lcom/robinhood/utils/resource/StringResource;", "getSmsSubtitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "formatPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "MfaMethod", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class MfaSettingsViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isLoading;
    private final boolean isRhcApp;
    private final Mfa mfa;
    private final String phoneNumber;
    private final CharSequence subtitleText;
    private final User user;

    /* compiled from: MfaSettingsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.PROMPTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final Mfa getMfa() {
        return this.mfa;
    }

    /* renamed from: component4, reason: from getter */
    private final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    /* renamed from: component6, reason: from getter */
    private final User getUser() {
        return this.user;
    }

    public static /* synthetic */ MfaSettingsViewState copy$default(MfaSettingsViewState mfaSettingsViewState, CharSequence charSequence, UiEvent uiEvent, Mfa mfa, String str, boolean z, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = mfaSettingsViewState.subtitleText;
        }
        if ((i & 2) != 0) {
            uiEvent = mfaSettingsViewState.errorEvent;
        }
        if ((i & 4) != 0) {
            mfa = mfaSettingsViewState.mfa;
        }
        if ((i & 8) != 0) {
            str = mfaSettingsViewState.phoneNumber;
        }
        if ((i & 16) != 0) {
            z = mfaSettingsViewState.isRhcApp;
        }
        if ((i & 32) != 0) {
            user = mfaSettingsViewState.user;
        }
        boolean z2 = z;
        User user2 = user;
        return mfaSettingsViewState.copy(charSequence, uiEvent, mfa, str, z2, user2);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getSubtitleText() {
        return this.subtitleText;
    }

    public final UiEvent<Throwable> component2() {
        return this.errorEvent;
    }

    public final MfaSettingsViewState copy(CharSequence subtitleText, UiEvent<Throwable> errorEvent, Mfa mfa, String phoneNumber, boolean isRhcApp, User user) {
        return new MfaSettingsViewState(subtitleText, errorEvent, mfa, phoneNumber, isRhcApp, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaSettingsViewState)) {
            return false;
        }
        MfaSettingsViewState mfaSettingsViewState = (MfaSettingsViewState) other;
        return Intrinsics.areEqual(this.subtitleText, mfaSettingsViewState.subtitleText) && Intrinsics.areEqual(this.errorEvent, mfaSettingsViewState.errorEvent) && Intrinsics.areEqual(this.mfa, mfaSettingsViewState.mfa) && Intrinsics.areEqual(this.phoneNumber, mfaSettingsViewState.phoneNumber) && this.isRhcApp == mfaSettingsViewState.isRhcApp && Intrinsics.areEqual(this.user, mfaSettingsViewState.user);
    }

    public int hashCode() {
        CharSequence charSequence = this.subtitleText;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        Mfa mfa = this.mfa;
        int iHashCode3 = (iHashCode2 + (mfa == null ? 0 : mfa.hashCode())) * 31;
        String str = this.phoneNumber;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isRhcApp)) * 31;
        User user = this.user;
        return iHashCode4 + (user != null ? user.hashCode() : 0);
    }

    public String toString() {
        CharSequence charSequence = this.subtitleText;
        return "MfaSettingsViewState(subtitleText=" + ((Object) charSequence) + ", errorEvent=" + this.errorEvent + ", mfa=" + this.mfa + ", phoneNumber=" + this.phoneNumber + ", isRhcApp=" + this.isRhcApp + ", user=" + this.user + ")";
    }

    public MfaSettingsViewState(CharSequence charSequence, UiEvent<Throwable> uiEvent, Mfa mfa, String str, boolean z, User user) {
        this.subtitleText = charSequence;
        this.errorEvent = uiEvent;
        this.mfa = mfa;
        this.phoneNumber = str;
        this.isRhcApp = z;
        this.user = user;
        this.isLoading = charSequence == null;
    }

    public /* synthetic */ MfaSettingsViewState(CharSequence charSequence, UiEvent uiEvent, Mfa mfa, String str, boolean z, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : mfa, (i & 8) != 0 ? null : str, z, (i & 32) != 0 ? null : user);
    }

    public final CharSequence getSubtitleText() {
        return this.subtitleText;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final boolean isCurrentMethodVisible() {
        Mfa mfa = this.mfa;
        return mfa != null && mfa.getEnabled();
    }

    public final boolean isChangeMethodVisible() {
        return !getChangeMethodsList$feature_security_center_externalDebug().isEmpty();
    }

    public final int getChangeMethodTitleRes() {
        if (isCurrentMethodVisible()) {
            return C28186R.string.setting_mfa_switch_method_title;
        }
        return C28186R.string.setting_mfa_select_method_title;
    }

    public final List<MfaMethod> getCurrentMethodsList$feature_security_center_externalDebug() {
        if (this.mfa == null) {
            return CollectionsKt.emptyList();
        }
        return getCurrentMfaMethodsList();
    }

    private final List<MfaMethod> getCurrentMfaMethodsList() {
        Challenge.Type challengeType;
        List<MfaMethod> listListOf;
        Mfa mfa = this.mfa;
        if (mfa != null && (challengeType = mfa.getChallengeType()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[challengeType.ordinal()];
            if (i == 1) {
                listListOf = CollectionsKt.listOf(new MfaMethod.Sms(getSmsSubtitleRes()));
            } else if (i == 2) {
                listListOf = CollectionsKt.listOf(MfaMethod.App.INSTANCE);
            } else if (i == 3) {
                listListOf = CollectionsKt.listOf((Object[]) new MfaMethod[]{MfaMethod.Prompts.INSTANCE, new MfaMethod.Sms(getSmsSubtitleRes())});
            } else {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(challengeType);
                throw new ExceptionsH();
            }
            if (listListOf != null) {
                return listListOf;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final List<MfaMethod> getChangeMethodsList$feature_security_center_externalDebug() {
        if (this.mfa == null) {
            return CollectionsKt.emptyList();
        }
        List<MfaMethod> mfaMethods = getMfaMethods();
        ArrayList arrayList = new ArrayList();
        for (Object obj : mfaMethods) {
            if (!getCurrentMfaMethodsList().contains((MfaMethod) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<MfaMethod> getMfaMethods() {
        if (this.isRhcApp) {
            return CollectionsKt.listOf(new MfaMethod.Sms(getSmsSubtitleRes()));
        }
        return CollectionsKt.listOf((Object[]) new MfaMethod[]{MfaMethod.Prompts.INSTANCE, new MfaMethod.Sms(getSmsSubtitleRes()), MfaMethod.App.INSTANCE});
    }

    private final StringResource getSmsSubtitleRes() {
        Mfa mfa;
        if (this.phoneNumber != null && (mfa = this.mfa) != null && mfa.isPromptsBased()) {
            return StringResource.INSTANCE.invoke(C28186R.string.setting_mfa_sms_phone_number_label, formatPhoneNumber(this.phoneNumber));
        }
        Mfa mfa2 = this.mfa;
        if (mfa2 != null && mfa2.isSmsBased()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C28186R.string.setting_mfa_sms_phone_number_label;
            String phoneNumber = this.mfa.getPhoneNumber();
            Intrinsics.checkNotNull(phoneNumber);
            return companion.invoke(i, formatPhoneNumber(phoneNumber));
        }
        return StringResource.INSTANCE.invoke("");
    }

    private final String formatPhoneNumber(String phoneNumber) {
        return PhoneFormat.formatPhoneForMfa(phoneNumber, this.user);
    }

    /* compiled from: MfaSettingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod;", "", "labelRes", "", "loggingIdentifier", "", "iconRes", "<init>", "(ILjava/lang/String;I)V", "getLabelRes", "()I", "getLoggingIdentifier", "()Ljava/lang/String;", "getIconRes", "Prompts", "Sms", "App", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod$App;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod$Prompts;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod$Sms;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class MfaMethod {
        public static final int $stable = 0;
        private final int iconRes;
        private final int labelRes;
        private final String loggingIdentifier;

        public /* synthetic */ MfaMethod(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, i2);
        }

        private MfaMethod(int i, String str, int i2) {
            this.labelRes = i;
            this.loggingIdentifier = str;
            this.iconRes = i2;
        }

        public final int getLabelRes() {
            return this.labelRes;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final int getIconRes() {
            return this.iconRes;
        }

        /* compiled from: MfaSettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod$Prompts;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Prompts extends MfaMethod {
            public static final int $stable = 0;
            public static final Prompts INSTANCE = new Prompts();

            public boolean equals(Object other) {
                return this == other || (other instanceof Prompts);
            }

            public int hashCode() {
                return 53563352;
            }

            public String toString() {
                return "Prompts";
            }

            private Prompts() {
                super(C28186R.string.setting_mfa_method_prompts_label, "prompt", C20690R.drawable.ic_rds_notification_24dp, null);
            }
        }

        /* compiled from: MfaSettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod$Sms;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod;", "subtitleRes", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getSubtitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Sms extends MfaMethod {
            public static final int $stable = StringResource.$stable;
            private final StringResource subtitleRes;

            public static /* synthetic */ Sms copy$default(Sms sms, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = sms.subtitleRes;
                }
                return sms.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getSubtitleRes() {
                return this.subtitleRes;
            }

            public final Sms copy(StringResource subtitleRes) {
                Intrinsics.checkNotNullParameter(subtitleRes, "subtitleRes");
                return new Sms(subtitleRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Sms) && Intrinsics.areEqual(this.subtitleRes, ((Sms) other).subtitleRes);
            }

            public int hashCode() {
                return this.subtitleRes.hashCode();
            }

            public String toString() {
                return "Sms(subtitleRes=" + this.subtitleRes + ")";
            }

            public final StringResource getSubtitleRes() {
                return this.subtitleRes;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sms(StringResource subtitleRes) {
                super(C28186R.string.setting_mfa_method_sms_label, "auth-app", C20690R.drawable.ic_rds_chat_24dp, null);
                Intrinsics.checkNotNullParameter(subtitleRes, "subtitleRes");
                this.subtitleRes = subtitleRes;
            }
        }

        /* compiled from: MfaSettingsViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod$App;", "Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsViewState$MfaMethod;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class App extends MfaMethod {
            public static final int $stable = 0;
            public static final App INSTANCE = new App();

            public boolean equals(Object other) {
                return this == other || (other instanceof App);
            }

            public int hashCode() {
                return 2069136106;
            }

            public String toString() {
                return "App";
            }

            private App() {
                super(C28186R.string.setting_mfa_method_app_label, "sms", C20690R.drawable.ic_rds_unlock_24dp, null);
            }
        }
    }
}
