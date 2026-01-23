package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.PathfinderInitialState;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactSupportFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "TriageFlow", "Uar", "Email", "Sassy", "Debug", "Companion", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Debug;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Email;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Sassy;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$TriageFlow;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Uar;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface ContactSupportFragmentKey extends FragmentKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String TOPIC_ID_ACCOUNT = "2024";
    public static final String TOPIC_ID_APP_RATING_FEEDBACK = "75";
    public static final String TOPIC_ID_CASH_MANAGEMENT_DEBIT_CARDS_AND_PURCHASES = "82";
    public static final String TOPIC_ID_CASH_MANAGEMENT_DISPUTE_TRANSACTION = "120";
    public static final String TOPIC_ID_CASH_MANAGEMENT_GENERIC = "78";
    public static final String TOPIC_ID_CASH_MANAGEMENT_INTEREST_BALANCES = "81";
    public static final String TOPIC_ID_CASH_MANAGEMENT_SOMETHING_ELSE = "85";
    public static final String TOPIC_ID_CHANGE_NAME = "132";
    public static final String TOPIC_ID_DEACTIVATE_ACCOUNT = "77";
    public static final String TOPIC_ID_GOLD_DOWNGRADE = "74";
    public static final String TOPIC_ID_INVESTOR_PROFILE = "brokerage.investor-profile";
    public static final String TOPIC_ID_IRA_CONTRIBUTIONS = "149";
    public static final String TOPIC_ID_OPTION_UPGRADE_INELIGIBILITY_PROFILE = "2039";
    public static final String TOPIC_ID_OPTION_UPGRADE_INELIGIBILITY_PROFILE_UK_OR_APAC = "1923";
    public static final String TOPIC_ID_REACTIVATION = "36";
    public static final String TOPIC_ID_RHY_GENERIC = "150";
    public static final String TOPIC_ID_SOMETHING_ELSE = "87";

    /* compiled from: ContactSupportFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$TriageFlow;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "initialState", "Lcom/robinhood/models/api/PathfinderInitialState;", "topicId", "", "inquiryId", "Ljava/util/UUID;", "breadcrumbResolver", "Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "unknownParams", "", "<init>", "(Lcom/robinhood/models/api/PathfinderInitialState;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;Ljava/util/Map;)V", "getInitialState", "()Lcom/robinhood/models/api/PathfinderInitialState;", "getTopicId", "()Ljava/lang/String;", "getInquiryId", "()Ljava/util/UUID;", "getBreadcrumbResolver", "()Lcom/robinhood/shared/support/contracts/SupportBreadcrumbResolver;", "getUnknownParams", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TriageFlow implements ContactSupportFragmentKey {
        public static final Parcelable.Creator<TriageFlow> CREATOR = new Creator();
        private final SupportBreadcrumbResolver breadcrumbResolver;
        private final PathfinderInitialState initialState;
        private final UUID inquiryId;
        private final String topicId;
        private final Map<String, String> unknownParams;

        /* compiled from: ContactSupportFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<TriageFlow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TriageFlow createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PathfinderInitialState pathfinderInitialStateValueOf = parcel.readInt() == 0 ? null : PathfinderInitialState.valueOf(parcel.readString());
                String string2 = parcel.readString();
                UUID uuid = (UUID) parcel.readSerializable();
                SupportBreadcrumbResolver supportBreadcrumbResolver = (SupportBreadcrumbResolver) parcel.readParcelable(TriageFlow.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new TriageFlow(pathfinderInitialStateValueOf, string2, uuid, supportBreadcrumbResolver, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TriageFlow[] newArray(int i) {
                return new TriageFlow[i];
            }
        }

        public TriageFlow() {
            this(null, null, null, null, null, 31, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PathfinderInitialState pathfinderInitialState = this.initialState;
            if (pathfinderInitialState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(pathfinderInitialState.name());
            }
            dest.writeString(this.topicId);
            dest.writeSerializable(this.inquiryId);
            dest.writeParcelable(this.breadcrumbResolver, flags);
            Map<String, String> map = this.unknownParams;
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }

        public TriageFlow(PathfinderInitialState pathfinderInitialState, String str, UUID uuid, SupportBreadcrumbResolver supportBreadcrumbResolver, Map<String, String> unknownParams) {
            Intrinsics.checkNotNullParameter(unknownParams, "unknownParams");
            this.initialState = pathfinderInitialState;
            this.topicId = str;
            this.inquiryId = uuid;
            this.breadcrumbResolver = supportBreadcrumbResolver;
            this.unknownParams = unknownParams;
        }

        public final PathfinderInitialState getInitialState() {
            return this.initialState;
        }

        public final String getTopicId() {
            return this.topicId;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final SupportBreadcrumbResolver getBreadcrumbResolver() {
            return this.breadcrumbResolver;
        }

        public /* synthetic */ TriageFlow(PathfinderInitialState pathfinderInitialState, String str, UUID uuid, SupportBreadcrumbResolver supportBreadcrumbResolver, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pathfinderInitialState, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? null : supportBreadcrumbResolver, (i & 16) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, String> getUnknownParams() {
            return this.unknownParams;
        }
    }

    /* compiled from: ContactSupportFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Uar;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "username", "", "challengeType", "Lcom/robinhood/models/api/Challenge$Type;", "source", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/Challenge$Type;Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "getChallengeType", "()Lcom/robinhood/models/api/Challenge$Type;", "getSource", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Uar implements ContactSupportFragmentKey {
        public static final Parcelable.Creator<Uar> CREATOR = new Creator();
        private final Challenge.Type challengeType;
        private final String source;
        private final String username;

        /* compiled from: ContactSupportFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Uar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Uar createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Uar(parcel.readString(), Challenge.Type.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Uar[] newArray(int i) {
                return new Uar[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.username);
            dest.writeString(this.challengeType.name());
            dest.writeString(this.source);
        }

        public Uar(String username, Challenge.Type challengeType, String source) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(challengeType, "challengeType");
            Intrinsics.checkNotNullParameter(source, "source");
            this.username = username;
            this.challengeType = challengeType;
            this.source = source;
        }

        public final String getUsername() {
            return this.username;
        }

        public final Challenge.Type getChallengeType() {
            return this.challengeType;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: ContactSupportFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Email;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "inquiryId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInquiryId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Email implements ContactSupportFragmentKey {
        public static final Parcelable.Creator<Email> CREATOR = new Creator();
        private final UUID inquiryId;

        /* compiled from: ContactSupportFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Email> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Email createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i) {
                return new Email[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
        }

        public Email(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }
    }

    /* compiled from: ContactSupportFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006HÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Sassy;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "flow", "", "version", "inputParams", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFlow", "()Ljava/lang/String;", "getVersion", "getInputParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Sassy implements ContactSupportFragmentKey {
        public static final Parcelable.Creator<Sassy> CREATOR = new Creator();
        private final String flow;
        private final Map<String, JsonPrimitive<?>> inputParams;
        private final String version;

        /* compiled from: ContactSupportFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Sassy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sassy createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Sassy.class.getClassLoader()));
                }
                return new Sassy(string2, string3, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sassy[] newArray(int i) {
                return new Sassy[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sassy copy$default(Sassy sassy, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sassy.flow;
            }
            if ((i & 2) != 0) {
                str2 = sassy.version;
            }
            if ((i & 4) != 0) {
                map = sassy.inputParams;
            }
            return sassy.copy(str, str2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFlow() {
            return this.flow;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Map<String, JsonPrimitive<?>> component3() {
            return this.inputParams;
        }

        public final Sassy copy(String flow, String version, Map<String, ? extends JsonPrimitive<?>> inputParams) {
            Intrinsics.checkNotNullParameter(inputParams, "inputParams");
            return new Sassy(flow, version, inputParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sassy)) {
                return false;
            }
            Sassy sassy = (Sassy) other;
            return Intrinsics.areEqual(this.flow, sassy.flow) && Intrinsics.areEqual(this.version, sassy.version) && Intrinsics.areEqual(this.inputParams, sassy.inputParams);
        }

        public int hashCode() {
            String str = this.flow;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.version;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.inputParams.hashCode();
        }

        public String toString() {
            return "Sassy(flow=" + this.flow + ", version=" + this.version + ", inputParams=" + this.inputParams + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.flow);
            dest.writeString(this.version);
            Map<String, JsonPrimitive<?>> map = this.inputParams;
            dest.writeInt(map.size());
            for (Map.Entry<String, JsonPrimitive<?>> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sassy(String str, String str2, Map<String, ? extends JsonPrimitive<?>> inputParams) {
            Intrinsics.checkNotNullParameter(inputParams, "inputParams");
            this.flow = str;
            this.version = str2;
            this.inputParams = inputParams;
            if (str == null && str2 == null) {
                throw new IllegalStateException("require flowId or version to be not null");
            }
        }

        public /* synthetic */ Sassy(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, map);
        }

        public final String getFlow() {
            return this.flow;
        }

        public final String getVersion() {
            return this.version;
        }

        public final Map<String, JsonPrimitive<?>> getInputParams() {
            return this.inputParams;
        }
    }

    /* compiled from: ContactSupportFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Debug;", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Debug implements ContactSupportFragmentKey {
        public static final Debug INSTANCE = new Debug();
        public static final Parcelable.Creator<Debug> CREATOR = new Creator();

        /* compiled from: ContactSupportFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Debug> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Debug createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Debug.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Debug[] newArray(int i) {
                return new Debug[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Debug() {
        }
    }

    /* compiled from: ContactSupportFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey$Companion;", "", "<init>", "()V", "TOPIC_ID_INVESTOR_PROFILE", "", "TOPIC_ID_REACTIVATION", "TOPIC_ID_GOLD_DOWNGRADE", "TOPIC_ID_APP_RATING_FEEDBACK", "TOPIC_ID_DEACTIVATE_ACCOUNT", "TOPIC_ID_CASH_MANAGEMENT_GENERIC", "TOPIC_ID_CASH_MANAGEMENT_INTEREST_BALANCES", "TOPIC_ID_CASH_MANAGEMENT_DEBIT_CARDS_AND_PURCHASES", "TOPIC_ID_CASH_MANAGEMENT_SOMETHING_ELSE", "TOPIC_ID_SOMETHING_ELSE", "TOPIC_ID_CASH_MANAGEMENT_DISPUTE_TRANSACTION", "TOPIC_ID_CHANGE_NAME", "TOPIC_ID_RHY_GENERIC", "TOPIC_ID_ACCOUNT", "TOPIC_ID_IRA_CONTRIBUTIONS", "TOPIC_ID_OPTION_UPGRADE_INELIGIBILITY_PROFILE", "TOPIC_ID_OPTION_UPGRADE_INELIGIBILITY_PROFILE_UK_OR_APAC", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String TOPIC_ID_ACCOUNT = "2024";
        public static final String TOPIC_ID_APP_RATING_FEEDBACK = "75";
        public static final String TOPIC_ID_CASH_MANAGEMENT_DEBIT_CARDS_AND_PURCHASES = "82";
        public static final String TOPIC_ID_CASH_MANAGEMENT_DISPUTE_TRANSACTION = "120";
        public static final String TOPIC_ID_CASH_MANAGEMENT_GENERIC = "78";
        public static final String TOPIC_ID_CASH_MANAGEMENT_INTEREST_BALANCES = "81";
        public static final String TOPIC_ID_CASH_MANAGEMENT_SOMETHING_ELSE = "85";
        public static final String TOPIC_ID_CHANGE_NAME = "132";
        public static final String TOPIC_ID_DEACTIVATE_ACCOUNT = "77";
        public static final String TOPIC_ID_GOLD_DOWNGRADE = "74";
        public static final String TOPIC_ID_INVESTOR_PROFILE = "brokerage.investor-profile";
        public static final String TOPIC_ID_IRA_CONTRIBUTIONS = "149";
        public static final String TOPIC_ID_OPTION_UPGRADE_INELIGIBILITY_PROFILE = "2039";
        public static final String TOPIC_ID_OPTION_UPGRADE_INELIGIBILITY_PROFILE_UK_OR_APAC = "1923";
        public static final String TOPIC_ID_REACTIVATION = "36";
        public static final String TOPIC_ID_RHY_GENERIC = "150";
        public static final String TOPIC_ID_SOMETHING_ELSE = "87";

        private Companion() {
        }
    }
}
