package com.robinhood.android.settings.settings.account.trustedcontact;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo;
import com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateViewState2;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.TrustedContactStore;
import com.robinhood.models.api.identi.ApiAddress;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UiAddressKt;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: TrustedContactUpdateDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002%&B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0011J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "trustedContactStore", "Lcom/robinhood/librobinhood/data/store/identi/TrustedContactStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/TrustedContactStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "answers", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateDuxo$TrustedContactAnswers;", "onCreate", "", "setAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "clearAddress", "acceptChange", "field", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactField;", "answer", "", "onInternationalInfoSelected", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/common/util/InternationalInfo;", "submitTrustedContact", "checkBeforeGoingBack", "hasChanges", "", "populateMapWithExistingAnswers", "model", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "TrustedContactAnswers", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class TrustedContactUpdateDuxo extends OldBaseDuxo<TrustedContactUpdateViewState> implements HasSavedState {
    private final TrustedContactAnswers answers;
    private final SavedStateHandle savedStateHandle;
    private final TrustedContactStore trustedContactStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TrustedContactUpdateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrustedContactField.values().length];
            try {
                iArr[TrustedContactField.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrustedContactField.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrustedContactField.PHONE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrustedContactField.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrustedContactUpdateDuxo(TrustedContactStore trustedContactStore, UserStore userStore, SavedStateHandle savedStateHandle) {
        super(new TrustedContactUpdateViewState(false, false, null, null, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(trustedContactStore, "trustedContactStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.trustedContactStore = trustedContactStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        this.answers = new TrustedContactAnswers(objArr2, objArr3, objArr4, objArr5, null, objArr, 63, null);
    }

    /* compiled from: TrustedContactUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u00100\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateDuxo$TrustedContactAnswers;", "", "firstName", "", "lastName", "email", "phoneNumber", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/common/util/InternationalInfo;Lcom/robinhood/models/ui/identi/UiAddress;)V", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getLastName", "setLastName", "getEmail", "setEmail", "getPhoneNumber", "setPhoneNumber", "getInternationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "setInternationalInfo", "(Lcom/robinhood/android/common/util/InternationalInfo;)V", "getAddress", "()Lcom/robinhood/models/ui/identi/UiAddress;", "setAddress", "(Lcom/robinhood/models/ui/identi/UiAddress;)V", "submittable", "", "getSubmittable", "()Z", "sanitizedPhoneNumber", "getSanitizedPhoneNumber", "isEmpty", "matches", "trustedContact", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class TrustedContactAnswers {
        public static final int $stable = 8;
        private UiAddress address;
        private String email;
        private String firstName;
        private InternationalInfo internationalInfo;
        private String lastName;
        private String phoneNumber;

        public TrustedContactAnswers() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ TrustedContactAnswers copy$default(TrustedContactAnswers trustedContactAnswers, String str, String str2, String str3, String str4, InternationalInfo internationalInfo, UiAddress uiAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trustedContactAnswers.firstName;
            }
            if ((i & 2) != 0) {
                str2 = trustedContactAnswers.lastName;
            }
            if ((i & 4) != 0) {
                str3 = trustedContactAnswers.email;
            }
            if ((i & 8) != 0) {
                str4 = trustedContactAnswers.phoneNumber;
            }
            if ((i & 16) != 0) {
                internationalInfo = trustedContactAnswers.internationalInfo;
            }
            if ((i & 32) != 0) {
                uiAddress = trustedContactAnswers.address;
            }
            InternationalInfo internationalInfo2 = internationalInfo;
            UiAddress uiAddress2 = uiAddress;
            return trustedContactAnswers.copy(str, str2, str3, str4, internationalInfo2, uiAddress2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final InternationalInfo getInternationalInfo() {
            return this.internationalInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final UiAddress getAddress() {
            return this.address;
        }

        public final TrustedContactAnswers copy(String firstName, String lastName, String email, String phoneNumber, InternationalInfo internationalInfo, UiAddress address) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
            return new TrustedContactAnswers(firstName, lastName, email, phoneNumber, internationalInfo, address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustedContactAnswers)) {
                return false;
            }
            TrustedContactAnswers trustedContactAnswers = (TrustedContactAnswers) other;
            return Intrinsics.areEqual(this.firstName, trustedContactAnswers.firstName) && Intrinsics.areEqual(this.lastName, trustedContactAnswers.lastName) && Intrinsics.areEqual(this.email, trustedContactAnswers.email) && Intrinsics.areEqual(this.phoneNumber, trustedContactAnswers.phoneNumber) && Intrinsics.areEqual(this.internationalInfo, trustedContactAnswers.internationalInfo) && Intrinsics.areEqual(this.address, trustedContactAnswers.address);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.internationalInfo.hashCode()) * 31;
            UiAddress uiAddress = this.address;
            return iHashCode + (uiAddress == null ? 0 : uiAddress.hashCode());
        }

        public String toString() {
            return "TrustedContactAnswers(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", internationalInfo=" + this.internationalInfo + ", address=" + this.address + ")";
        }

        public TrustedContactAnswers(String firstName, String lastName, String email, String phoneNumber, InternationalInfo internationalInfo, UiAddress uiAddress) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.internationalInfo = internationalInfo;
            this.address = uiAddress;
        }

        public /* synthetic */ TrustedContactAnswers(String str, String str2, String str3, String str4, InternationalInfo internationalInfo, UiAddress uiAddress, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? TrustedContactUpdateViewState3.getUsInfo() : internationalInfo, (i & 32) != 0 ? null : uiAddress);
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final void setFirstName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.firstName = str;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final void setLastName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.lastName = str;
        }

        public final String getEmail() {
            return this.email;
        }

        public final void setEmail(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.email = str;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final void setPhoneNumber(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.phoneNumber = str;
        }

        public final InternationalInfo getInternationalInfo() {
            return this.internationalInfo;
        }

        public final void setInternationalInfo(InternationalInfo internationalInfo) {
            Intrinsics.checkNotNullParameter(internationalInfo, "<set-?>");
            this.internationalInfo = internationalInfo;
        }

        public final UiAddress getAddress() {
            return this.address;
        }

        public final void setAddress(UiAddress uiAddress) {
            this.address = uiAddress;
        }

        public final boolean getSubmittable() {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{this.firstName, this.lastName, this.email, this.phoneNumber});
            if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
                return true;
            }
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (StringsKt.isBlank((String) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final String getSanitizedPhoneNumber() throws IOException {
            String str = this.phoneNumber;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!CharsKt.isWhitespace(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            return "+" + TrustedContactUpdateViewState3.stripNumberToDigits(this.internationalInfo.getCountryCallingCode()) + string2;
        }

        public final boolean isEmpty() {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{this.firstName, this.lastName, this.email, this.phoneNumber});
            if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
                Iterator it = listListOf.iterator();
                while (it.hasNext()) {
                    if (!StringsKt.isBlank((String) it.next())) {
                        return false;
                    }
                }
            }
            return this.address == null;
        }

        public final boolean matches(ApiTrustedContact trustedContact) {
            Intrinsics.checkNotNullParameter(trustedContact, "trustedContact");
            if (!Intrinsics.areEqual(this.firstName, trustedContact.getFirst_name()) || !Intrinsics.areEqual(this.lastName, trustedContact.getLast_name()) || !Intrinsics.areEqual(this.email, trustedContact.getEmail()) || !Intrinsics.areEqual(getSanitizedPhoneNumber(), trustedContact.getPhone_number())) {
                return false;
            }
            UiAddress uiAddress = this.address;
            ApiAddress address = trustedContact.getAddress();
            return Intrinsics.areEqual(uiAddress, address != null ? UiAddressKt.toUiAddress(address) : null);
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        final ApiTrustedContact trustedContact = ((LegacyFragmentKey.TrustedContactUpdate) INSTANCE.getArgs((HasSavedState) this)).getTrustedContact();
        if (trustedContact != null) {
            populateMapWithExistingAnswers(trustedContact);
            final TrustedContactUpdateViewState2.SetInputs setInputs = new TrustedContactUpdateViewState2.SetInputs(trustedContact);
            this.answers.setInternationalInfo(setInputs.getInternationalInfo());
            applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrustedContactUpdateDuxo.onCreate$lambda$1$lambda$0(setInputs, trustedContact, (TrustedContactUpdateViewState) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.onCreate$lambda$3(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState onCreate$lambda$1$lambda$0(TrustedContactUpdateViewState2.SetInputs setInputs, ApiTrustedContact apiTrustedContact, TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UiEvent uiEvent = new UiEvent(setInputs);
        ApiAddress address = apiTrustedContact.getAddress();
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, false, address != null ? UiAddressKt.toUiAddress(address) : null, uiEvent, null, null, 51, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final TrustedContactUpdateDuxo trustedContactUpdateDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        trustedContactUpdateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.onCreate$lambda$3$lambda$2(user, trustedContactUpdateDuxo, (TrustedContactUpdateViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState onCreate$lambda$3$lambda$2(User user, TrustedContactUpdateDuxo trustedContactUpdateDuxo, TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        InternationalInfo internationalInfoFromCountryCode$default = InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, user.getOrigin().getLocality(), 1, null);
        trustedContactUpdateDuxo.answers.setInternationalInfo(internationalInfoFromCountryCode$default);
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, false, null, null, new UiEvent(internationalInfoFromCountryCode$default), user.getOrigin().getLocality(), 15, null);
    }

    public final void setAddress(final UiAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.answers.setAddress(address);
        applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.setAddress$lambda$4(address, (TrustedContactUpdateViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState setAddress$lambda$4(UiAddress uiAddress, TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, false, uiAddress, null, null, null, 59, null);
    }

    public final void clearAddress() {
        this.answers.setAddress(null);
        applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.clearAddress$lambda$5((TrustedContactUpdateViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState clearAddress$lambda$5(TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, false, null, null, null, null, 59, null);
    }

    public final void acceptChange(TrustedContactField field, String answer) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(answer, "answer");
        int i = WhenMappings.$EnumSwitchMapping$0[field.ordinal()];
        if (i == 1) {
            this.answers.setFirstName(answer);
        } else if (i == 2) {
            this.answers.setLastName(answer);
        } else if (i == 3) {
            this.answers.setPhoneNumber(answer);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.answers.setEmail(answer);
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.acceptChange$lambda$6(this.f$0, (TrustedContactUpdateViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState acceptChange$lambda$6(TrustedContactUpdateDuxo trustedContactUpdateDuxo, TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, trustedContactUpdateDuxo.answers.getSubmittable(), null, null, null, null, 61, null);
    }

    public final void onInternationalInfoSelected(InternationalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.answers.setInternationalInfo(info);
    }

    public final void submitTrustedContact() {
        Single<ApiTrustedContact> singleDoOnSubscribe = this.trustedContactStore.submitTrustedContact(this.answers.getFirstName(), this.answers.getLastName(), this.answers.getEmail(), this.answers.getSanitizedPhoneNumber(), this.answers.getAddress()).doOnSubscribe(new C283391());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.submitTrustedContact$lambda$8(this.f$0, (ApiTrustedContact) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.submitTrustedContact$lambda$10(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: TrustedContactUpdateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$submitTrustedContact$1 */
    static final class C283391<T> implements Consumer {
        C283391() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TrustedContactUpdateViewState accept$lambda$0(TrustedContactUpdateViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return TrustedContactUpdateViewState.copy$default(applyMutation, true, false, null, null, null, null, 62, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            TrustedContactUpdateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$submitTrustedContact$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrustedContactUpdateDuxo.C283391.accept$lambda$0((TrustedContactUpdateViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitTrustedContact$lambda$8(TrustedContactUpdateDuxo trustedContactUpdateDuxo, final ApiTrustedContact apiTrustedContact) {
        trustedContactUpdateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.submitTrustedContact$lambda$8$lambda$7(apiTrustedContact, (TrustedContactUpdateViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState submitTrustedContact$lambda$8$lambda$7(ApiTrustedContact apiTrustedContact, TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(apiTrustedContact);
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, false, null, new UiEvent(new TrustedContactUpdateViewState2.SuccessfulSubmission(apiTrustedContact)), null, null, 54, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitTrustedContact$lambda$10(TrustedContactUpdateDuxo trustedContactUpdateDuxo, final Throwable err) {
        Intrinsics.checkNotNullParameter(err, "err");
        trustedContactUpdateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.submitTrustedContact$lambda$10$lambda$9(err, (TrustedContactUpdateViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState submitTrustedContact$lambda$10$lambda$9(Throwable th, TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, false, null, new UiEvent(new TrustedContactUpdateViewState2.Error(th)), null, null, 54, null);
    }

    public final void checkBeforeGoingBack() {
        final TrustedContactUpdateViewState2 trustedContactUpdateViewState2 = hasChanges() ? TrustedContactUpdateViewState2.ConfirmDiscard.INSTANCE : TrustedContactUpdateViewState2.PopBack.INSTANCE;
        applyMutation(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateDuxo.checkBeforeGoingBack$lambda$11(trustedContactUpdateViewState2, (TrustedContactUpdateViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrustedContactUpdateViewState checkBeforeGoingBack$lambda$11(TrustedContactUpdateViewState2 trustedContactUpdateViewState2, TrustedContactUpdateViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TrustedContactUpdateViewState.copy$default(applyMutation, false, false, null, new UiEvent(trustedContactUpdateViewState2), null, null, 55, null);
    }

    private final boolean hasChanges() {
        ApiTrustedContact trustedContact = ((LegacyFragmentKey.TrustedContactUpdate) INSTANCE.getArgs((HasSavedState) this)).getTrustedContact();
        return trustedContact == null ? !this.answers.isEmpty() : !this.answers.matches(trustedContact);
    }

    private final void populateMapWithExistingAnswers(ApiTrustedContact model) {
        this.answers.setFirstName(model.getFirst_name());
        this.answers.setLastName(model.getLast_name());
        this.answers.setEmail(model.getEmail());
        TrustedContactAnswers trustedContactAnswers = this.answers;
        ApiAddress address = model.getAddress();
        trustedContactAnswers.setAddress(address != null ? UiAddressKt.toUiAddress(address) : null);
    }

    /* compiled from: TrustedContactUpdateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TrustedContactUpdate;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TrustedContactUpdateDuxo, LegacyFragmentKey.TrustedContactUpdate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.TrustedContactUpdate getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.TrustedContactUpdate) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.TrustedContactUpdate getArgs(TrustedContactUpdateDuxo trustedContactUpdateDuxo) {
            return (LegacyFragmentKey.TrustedContactUpdate) DuxoCompanion.DefaultImpls.getArgs(this, trustedContactUpdateDuxo);
        }
    }
}
