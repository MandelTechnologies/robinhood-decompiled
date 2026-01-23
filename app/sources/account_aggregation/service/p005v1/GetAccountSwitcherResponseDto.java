package account_aggregation.service.p005v1;

import account_aggregation.service.models.p004v1.AccountSwitcherAccount;
import account_aggregation.service.models.p004v1.AccountSwitcherAccountDto;
import account_aggregation.service.models.p004v1.AccountSwitcherLocation;
import account_aggregation.service.models.p004v1.AccountSwitcherLocationDto;
import account_aggregation.service.p005v1.GetAccountSwitcherResponse;
import account_aggregation.service.p005v1.GetAccountSwitcherResponseDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetAccountSwitcherResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005.-/01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015¨\u00062"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponse;", "Landroid/os/Parcelable;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate;", "surrogate", "<init>", "(Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate;)V", "", "asset_id", "Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "location", "title", "", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto;", "accounts", "positive_button_text", "(Ljava/lang/String;Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toProto", "()Laccount_aggregation/service/v1/GetAccountSwitcherResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate;", "getAsset_id", "getLocation", "()Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "getTitle", "getAccounts", "()Ljava/util/List;", "getPositive_button_text", "Companion", "Surrogate", "SelectableItemDto", "Serializer", "MultibindingModule", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GetAccountSwitcherResponseDto implements Dto3<GetAccountSwitcherResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountSwitcherResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountSwitcherResponseDto, GetAccountSwitcherResponse>> binaryBase64Serializer$delegate;
    private static final GetAccountSwitcherResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountSwitcherResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountSwitcherResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAsset_id() {
        return this.surrogate.getAsset_id();
    }

    public final AccountSwitcherLocationDto getLocation() {
        return this.surrogate.getLocation();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final List<SelectableItemDto> getAccounts() {
        return this.surrogate.getAccounts();
    }

    public final String getPositive_button_text() {
        return this.surrogate.getPositive_button_text();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetAccountSwitcherResponseDto(java.lang.String r2, account_aggregation.service.models.p004v1.AccountSwitcherLocationDto r3, java.lang.String r4, java.util.List r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto Lf
            account_aggregation.service.models.v1.AccountSwitcherLocationDto$Companion r3 = account_aggregation.service.models.p004v1.AccountSwitcherLocationDto.INSTANCE
            account_aggregation.service.models.v1.AccountSwitcherLocationDto r3 = r3.getZeroValue()
        Lf:
            r8 = r7 & 4
            java.lang.String r0 = ""
            if (r8 == 0) goto L16
            r4 = r0
        L16:
            r8 = r7 & 8
            if (r8 == 0) goto L1e
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L1e:
            r7 = r7 & 16
            if (r7 == 0) goto L29
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2f
        L29:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2f:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: account_aggregation.service.p005v1.GetAccountSwitcherResponseDto.<init>(java.lang.String, account_aggregation.service.models.v1.AccountSwitcherLocationDto, java.lang.String, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAccountSwitcherResponseDto(String str, AccountSwitcherLocationDto location, String title, List<SelectableItemDto> accounts2, String positive_button_text) {
        this(new Surrogate(str, location, title, accounts2, positive_button_text));
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAccountSwitcherResponse toProto() {
        String asset_id = this.surrogate.getAsset_id();
        AccountSwitcherLocation accountSwitcherLocation = (AccountSwitcherLocation) this.surrogate.getLocation().toProto();
        String title = this.surrogate.getTitle();
        List<SelectableItemDto> accounts2 = this.surrogate.getAccounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
        Iterator<T> it = accounts2.iterator();
        while (it.hasNext()) {
            arrayList.add(((SelectableItemDto) it.next()).toProto());
        }
        return new GetAccountSwitcherResponse(asset_id, accountSwitcherLocation, title, arrayList, this.surrogate.getPositive_button_text(), null, 32, null);
    }

    public String toString() {
        return "[GetAccountSwitcherResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountSwitcherResponseDto) && Intrinsics.areEqual(((GetAccountSwitcherResponseDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GetAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000243BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001cR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010\u001c¨\u00065"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate;", "", "", "asset_id", "Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "location", "title", "", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto;", "accounts", "positive_button_text", "<init>", "(Ljava/lang/String;Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$account_aggregation_service_v1_externalRelease", "(Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsset_id", "getAsset_id$annotations", "()V", "Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "getLocation", "()Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "getLocation$annotations", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getAccounts", "()Ljava/util/List;", "getAccounts$annotations", "getPositive_button_text", "getPositive_button_text$annotations", "Companion", "$serializer", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<SelectableItemDto> accounts;
        private final String asset_id;
        private final AccountSwitcherLocationDto location;
        private final String positive_button_text;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: account_aggregation.service.v1.GetAccountSwitcherResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountSwitcherResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (AccountSwitcherLocationDto) null, (String) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SelectableItemDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.asset_id, surrogate.asset_id) && this.location == surrogate.location && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.accounts, surrogate.accounts) && Intrinsics.areEqual(this.positive_button_text, surrogate.positive_button_text);
        }

        public int hashCode() {
            String str = this.asset_id;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.location.hashCode()) * 31) + this.title.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.positive_button_text.hashCode();
        }

        public String toString() {
            return "Surrogate(asset_id=" + this.asset_id + ", location=" + this.location + ", title=" + this.title + ", accounts=" + this.accounts + ", positive_button_text=" + this.positive_button_text + ")";
        }

        /* compiled from: GetAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountSwitcherResponseDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, AccountSwitcherLocationDto accountSwitcherLocationDto, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.asset_id = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.location = AccountSwitcherLocationDto.INSTANCE.getZeroValue();
            } else {
                this.location = accountSwitcherLocationDto;
            }
            if ((i & 4) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 8) == 0) {
                this.accounts = CollectionsKt.emptyList();
            } else {
                this.accounts = list;
            }
            if ((i & 16) == 0) {
                this.positive_button_text = "";
            } else {
                this.positive_button_text = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$account_aggregation_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.asset_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            if (self.location != AccountSwitcherLocationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AccountSwitcherLocationDto.Serializer.INSTANCE, self.location);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 2, self.title);
            }
            if (!Intrinsics.areEqual(self.accounts, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.accounts);
            }
            if (Intrinsics.areEqual(self.positive_button_text, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.positive_button_text);
        }

        public Surrogate(String str, AccountSwitcherLocationDto location, String title, List<SelectableItemDto> accounts2, String positive_button_text) {
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
            this.asset_id = str;
            this.location = location;
            this.title = title;
            this.accounts = accounts2;
            this.positive_button_text = positive_button_text;
        }

        public final String getAsset_id() {
            return this.asset_id;
        }

        public final AccountSwitcherLocationDto getLocation() {
            return this.location;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, account_aggregation.service.models.p004v1.AccountSwitcherLocationDto r3, java.lang.String r4, java.util.List r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L5
                r2 = 0
            L5:
                r8 = r7 & 2
                if (r8 == 0) goto Lf
                account_aggregation.service.models.v1.AccountSwitcherLocationDto$Companion r3 = account_aggregation.service.models.p004v1.AccountSwitcherLocationDto.INSTANCE
                account_aggregation.service.models.v1.AccountSwitcherLocationDto r3 = r3.getZeroValue()
            Lf:
                r8 = r7 & 4
                java.lang.String r0 = ""
                if (r8 == 0) goto L16
                r4 = r0
            L16:
                r8 = r7 & 8
                if (r8 == 0) goto L1e
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L1e:
                r7 = r7 & 16
                if (r7 == 0) goto L29
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2f
            L29:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2f:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: account_aggregation.service.p005v1.GetAccountSwitcherResponseDto.Surrogate.<init>(java.lang.String, account_aggregation.service.models.v1.AccountSwitcherLocationDto, java.lang.String, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<SelectableItemDto> getAccounts() {
            return this.accounts;
        }

        public final String getPositive_button_text() {
            return this.positive_button_text;
        }
    }

    /* compiled from: GetAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountSwitcherResponseDto, GetAccountSwitcherResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountSwitcherResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountSwitcherResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountSwitcherResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountSwitcherResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountSwitcherResponse> getProtoAdapter() {
            return GetAccountSwitcherResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountSwitcherResponseDto getZeroValue() {
            return GetAccountSwitcherResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountSwitcherResponseDto fromProto(GetAccountSwitcherResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String asset_id = proto.getAsset_id();
            AccountSwitcherLocationDto accountSwitcherLocationDtoFromProto = AccountSwitcherLocationDto.INSTANCE.fromProto(proto.getLocation());
            String title = proto.getTitle();
            List<GetAccountSwitcherResponse.SelectableItem> accounts2 = proto.getAccounts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
            Iterator<T> it = accounts2.iterator();
            while (it.hasNext()) {
                arrayList.add(SelectableItemDto.INSTANCE.fromProto((GetAccountSwitcherResponse.SelectableItem) it.next()));
            }
            return new GetAccountSwitcherResponseDto(new Surrogate(asset_id, accountSwitcherLocationDtoFromProto, title, arrayList, proto.getPositive_button_text()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: account_aggregation.service.v1.GetAccountSwitcherResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountSwitcherResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetAccountSwitcherResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006)"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto;", "Lcom/robinhood/idl/MessageDto;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponse$SelectableItem;", "Landroid/os/Parcelable;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate;", "surrogate", "<init>", "(Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate;)V", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto;)V", "toProto", "()Laccount_aggregation/service/v1/GetAccountSwitcherResponse$SelectableItem;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate;", "Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "getAccount", "()Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "account", "Companion", "Surrogate", "ItemDto", "Serializer", "MultibindingModule", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SelectableItemDto implements Dto3<GetAccountSwitcherResponse.SelectableItem>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<SelectableItemDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SelectableItemDto, GetAccountSwitcherResponse.SelectableItem>> binaryBase64Serializer$delegate;
        private static final SelectableItemDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ SelectableItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private SelectableItemDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final AccountSwitcherAccountDto getAccount() {
            return this.surrogate.getAccount();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SelectableItemDto(ItemDto itemDto) {
            ItemDto.Account account = itemDto instanceof ItemDto.Account ? (ItemDto.Account) itemDto : null;
            this(new Surrogate(account != null ? account.getValue() : null));
        }

        public /* synthetic */ SelectableItemDto(ItemDto itemDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : itemDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetAccountSwitcherResponse.SelectableItem toProto() {
            AccountSwitcherAccountDto account = this.surrogate.getAccount();
            return new GetAccountSwitcherResponse.SelectableItem(account != null ? account.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[SelectableItemDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof SelectableItemDto) && Intrinsics.areEqual(((SelectableItemDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GetAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate;", "", "Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "account", "<init>", "(Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILaccount_aggregation/service/models/v1/AccountSwitcherAccountDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$account_aggregation_service_v1_externalRelease", "(Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "getAccount", "()Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "getAccount$annotations", "()V", "Companion", "$serializer", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final AccountSwitcherAccountDto account;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((AccountSwitcherAccountDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.account, ((Surrogate) other).account);
            }

            public int hashCode() {
                AccountSwitcherAccountDto accountSwitcherAccountDto = this.account;
                if (accountSwitcherAccountDto == null) {
                    return 0;
                }
                return accountSwitcherAccountDto.hashCode();
            }

            public String toString() {
                return "Surrogate(account=" + this.account + ")";
            }

            /* compiled from: GetAccountSwitcherResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetAccountSwitcherResponseDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, AccountSwitcherAccountDto accountSwitcherAccountDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.account = null;
                } else {
                    this.account = accountSwitcherAccountDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$account_aggregation_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                AccountSwitcherAccountDto accountSwitcherAccountDto = self.account;
                if (accountSwitcherAccountDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, AccountSwitcherAccountDto.Serializer.INSTANCE, accountSwitcherAccountDto);
                }
            }

            public Surrogate(AccountSwitcherAccountDto accountSwitcherAccountDto) {
                this.account = accountSwitcherAccountDto;
            }

            public /* synthetic */ Surrogate(AccountSwitcherAccountDto accountSwitcherAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : accountSwitcherAccountDto);
            }

            public final AccountSwitcherAccountDto getAccount() {
                return this.account;
            }
        }

        /* compiled from: GetAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponse$SelectableItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<SelectableItemDto, GetAccountSwitcherResponse.SelectableItem> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SelectableItemDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SelectableItemDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SelectableItemDto> getBinaryBase64Serializer() {
                return (KSerializer) SelectableItemDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetAccountSwitcherResponse.SelectableItem> getProtoAdapter() {
                return GetAccountSwitcherResponse.SelectableItem.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SelectableItemDto getZeroValue() {
                return SelectableItemDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SelectableItemDto fromProto(GetAccountSwitcherResponse.SelectableItem proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                AccountSwitcherAccount account = proto.getAccount();
                return new SelectableItemDto(new Surrogate(account != null ? AccountSwitcherAccountDto.INSTANCE.fromProto(account) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: account_aggregation.service.v1.GetAccountSwitcherResponseDto$SelectableItemDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetAccountSwitcherResponseDto.SelectableItemDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new SelectableItemDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Account", "Companion", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto$Account;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class ItemDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ ItemDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ItemDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: GetAccountSwitcherResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto$Account;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto;", "Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "value", "<init>", "(Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "getValue", "()Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Account extends ItemDto {
                private final AccountSwitcherAccountDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Account) && Intrinsics.areEqual(this.value, ((Account) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Account(value=" + this.value + ")";
                }

                public final AccountSwitcherAccountDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Account(AccountSwitcherAccountDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: GetAccountSwitcherResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$ItemDto;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponse$SelectableItem;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes23.dex */
            public static final class Companion implements Dto4.Creator<ItemDto, GetAccountSwitcherResponse.SelectableItem> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.idl.Dto.Creator
                public Void getZeroValue() {
                    return Dto4.Creator.DefaultImpls.getZeroValue(this);
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetAccountSwitcherResponse.SelectableItem> getProtoAdapter() {
                    return GetAccountSwitcherResponse.SelectableItem.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ItemDto fromProto(GetAccountSwitcherResponse.SelectableItem proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getAccount() != null) {
                        return new Account(AccountSwitcherAccountDto.INSTANCE.fromProto(proto.getAccount()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: GetAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto;", "<init>", "()V", "surrogateSerializer", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SelectableItemDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/account_aggregation.service.v1.GetAccountSwitcherResponse.SelectableItem", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SelectableItemDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public SelectableItemDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new SelectableItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$SelectableItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "account_aggregation.service.v1.GetAccountSwitcherResponseDto$SelectableItemDto";
            }
        }
    }

    /* compiled from: GetAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;", "<init>", "()V", "surrogateSerializer", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<GetAccountSwitcherResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/account_aggregation.service.v1.GetAccountSwitcherResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountSwitcherResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountSwitcherResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountSwitcherResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "account_aggregation.service.v1.GetAccountSwitcherResponseDto";
        }
    }
}
