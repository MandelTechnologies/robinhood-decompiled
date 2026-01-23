package com.withpersona.sdk2.inquiry.p424ui.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.nfc.ChipAuthenticationStatus;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComponentParam.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Landroid/os/Parcelable;", "<init>", "()V", "Adapter", "ComponentString", "ComponentStringList", "ComponentBoolean", "ComponentNumber", "Address", "ESignature", "GovernmentIdNfcScan", "InternationalDbParams", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class ComponentParam implements Parcelable {
    public /* synthetic */ ComponentParam(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Adapter extends JsonAdapter<ComponentParam> {
        public static final Adapter INSTANCE = new Adapter();

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ChipAuthenticationStatus.values().length];
                try {
                    iArr[ChipAuthenticationStatus.NotRequested.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChipAuthenticationStatus.NotSupported.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChipAuthenticationStatus.Failed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChipAuthenticationStatus.Success.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public ComponentParam fromJson(JsonReader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return null;
        }

        private Adapter() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, ComponentParam value) throws IOException {
            String str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (value instanceof ComponentString) {
                writer.value(((ComponentString) value).getValue());
                return;
            }
            if (value instanceof ComponentStringList) {
                writer.beginArray();
                Iterator<String> it = ((ComponentStringList) value).getValue().iterator();
                while (it.hasNext()) {
                    writer.value(it.next());
                }
                writer.endArray();
                return;
            }
            if (value instanceof Address) {
                writer.beginObject();
                Address address = (Address) value;
                String street1 = address.getStreet1();
                if (street1 != null) {
                    writer.name("street_1");
                    writer.value(street1);
                }
                String street2 = address.getStreet2();
                if (street2 != null) {
                    writer.name("street_2");
                    writer.value(street2);
                }
                String city = address.getCity();
                if (city != null) {
                    writer.name("city");
                    writer.value(city);
                }
                String subdivision = address.getSubdivision();
                if (subdivision != null) {
                    writer.name("subdivision");
                    writer.value(subdivision);
                }
                String postalCode = address.getPostalCode();
                if (postalCode != null) {
                    writer.name(PlaceTypes.POSTAL_CODE);
                    writer.value(postalCode);
                }
                writer.endObject();
                return;
            }
            if (value instanceof ComponentBoolean) {
                writer.value(((ComponentBoolean) value).getValue());
                return;
            }
            if (value instanceof ComponentNumber) {
                writer.value(new BigDecimal(((ComponentNumber) value).getValue().doubleValue()).toPlainString());
                return;
            }
            if (value instanceof ESignature) {
                writer.value(((ESignature) value).getSignatureImageString());
                return;
            }
            if (value instanceof GovernmentIdNfcScan) {
                writer.beginObject();
                GovernmentIdNfcScan governmentIdNfcScan = (GovernmentIdNfcScan) value;
                ChipAuthenticationStatus chipAuthenticationStatus = governmentIdNfcScan.getChipAuthenticationStatus();
                if (chipAuthenticationStatus != null) {
                    writer.name("caFlag");
                    int i = WhenMappings.$EnumSwitchMapping$0[chipAuthenticationStatus.ordinal()];
                    if (i == 1) {
                        str = "notRequested";
                    } else if (i == 2) {
                        str = "notSupported";
                    } else if (i == 3) {
                        str = "failed";
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "success";
                    }
                    writer.value(str);
                }
                String dg1 = governmentIdNfcScan.getDg1();
                if (dg1 != null) {
                    writer.name("dg1");
                    writer.value(dg1);
                }
                String dg2 = governmentIdNfcScan.getDg2();
                if (dg2 != null) {
                    writer.name("dg2");
                    writer.value(dg2);
                }
                String sod = governmentIdNfcScan.getSod();
                if (sod != null) {
                    writer.name("sod");
                    writer.value(sod);
                }
                writer.endObject();
                return;
            }
            if (!(value instanceof InternationalDbParams)) {
                if (value != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.INSTANCE;
                return;
            }
            writer.beginObject();
            InternationalDbParams internationalDbParams = (InternationalDbParams) value;
            String country = internationalDbParams.getCountry();
            if (country != null) {
                writer.name("idb_country");
                writer.value(country);
            }
            String type2 = internationalDbParams.getType();
            if (type2 != null) {
                writer.name("idb_type");
                writer.value(type2);
            }
            String value2 = internationalDbParams.getValue();
            if (value2 != null) {
                writer.name("idb_value");
                writer.value(value2);
            }
            writer.endObject();
        }
    }

    private ComponentParam() {
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ComponentString extends ComponentParam {
        public static final Parcelable.Creator<ComponentString> CREATOR = new Creator();
        private final String value;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ComponentString> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentString createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentString(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentString[] newArray(int i) {
                return new ComponentString[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentString(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "value", "", "", "<init>", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ComponentStringList extends ComponentParam {
        public static final Parcelable.Creator<ComponentStringList> CREATOR = new Creator();
        private final List<String> value;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ComponentStringList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentStringList createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentStringList(parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentStringList[] newArray(int i) {
                return new ComponentStringList[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentStringList(List<String> value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final List<String> getValue() {
            return this.value;
        }
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ComponentBoolean extends ComponentParam {
        public static final Parcelable.Creator<ComponentBoolean> CREATOR = new Creator();
        private final boolean value;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ComponentBoolean> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentBoolean createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentBoolean(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentBoolean[] newArray(int i) {
                return new ComponentBoolean[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.value ? 1 : 0);
        }

        public ComponentBoolean(boolean z) {
            super(null);
            this.value = z;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "value", "", "<init>", "(Ljava/lang/Number;)V", "getValue", "()Ljava/lang/Number;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ComponentNumber extends ComponentParam {
        public static final Parcelable.Creator<ComponentNumber> CREATOR = new Creator();
        private final Number value;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ComponentNumber> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentNumber createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentNumber((Number) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComponentNumber[] newArray(int i) {
                return new ComponentNumber[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentNumber(Number value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final Number getValue() {
            return this.value;
        }
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "street1", "", "street2", "city", "subdivision", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStreet1", "()Ljava/lang/String;", "getStreet2", "getCity", "getSubdivision", "getPostalCode", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Address extends ComponentParam {
        public static final Parcelable.Creator<Address> CREATOR = new Creator();
        private final String city;
        private final String postalCode;
        private final String street1;
        private final String street2;
        private final String subdivision;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Address> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i) {
                return new Address[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.street1);
            dest.writeString(this.street2);
            dest.writeString(this.city);
            dest.writeString(this.subdivision);
            dest.writeString(this.postalCode);
        }

        public final String getStreet1() {
            return this.street1;
        }

        public final String getStreet2() {
            return this.street2;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getSubdivision() {
            return this.subdivision;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public Address(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.street1 = str;
            this.street2 = str2;
            this.city = str3;
            this.subdivision = str4;
            this.postalCode = str5;
        }
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "signatureImageString", "", "<init>", "(Ljava/lang/String;)V", "getSignatureImageString", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ESignature extends ComponentParam {
        public static final Parcelable.Creator<ESignature> CREATOR = new Creator();
        private final String signatureImageString;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignature> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignature createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ESignature(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignature[] newArray(int i) {
                return new ESignature[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.signatureImageString);
        }

        public final String getSignatureImageString() {
            return this.signatureImageString;
        }

        public ESignature(String str) {
            super(null);
            this.signatureImageString = str;
        }
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "dg1", "", "dg2", "sod", "chipAuthenticationStatus", "Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;)V", "getDg1", "()Ljava/lang/String;", "getDg2", "getSod", "getChipAuthenticationStatus", "()Lcom/withpersona/sdk2/inquiry/nfc/ChipAuthenticationStatus;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class GovernmentIdNfcScan extends ComponentParam {
        public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new Creator();
        private final ChipAuthenticationStatus chipAuthenticationStatus;
        private final String dg1;
        private final String dg2;
        private final String sod;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScan> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScan createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdNfcScan(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ChipAuthenticationStatus.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScan[] newArray(int i) {
                return new GovernmentIdNfcScan[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.dg1);
            dest.writeString(this.dg2);
            dest.writeString(this.sod);
            ChipAuthenticationStatus chipAuthenticationStatus = this.chipAuthenticationStatus;
            if (chipAuthenticationStatus == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(chipAuthenticationStatus.name());
            }
        }

        public final String getDg1() {
            return this.dg1;
        }

        public final String getDg2() {
            return this.dg2;
        }

        public final String getSod() {
            return this.sod;
        }

        public final ChipAuthenticationStatus getChipAuthenticationStatus() {
            return this.chipAuthenticationStatus;
        }

        public GovernmentIdNfcScan(String str, String str2, String str3, ChipAuthenticationStatus chipAuthenticationStatus) {
            super(null);
            this.dg1 = str;
            this.dg2 = str2;
            this.sod = str3;
            this.chipAuthenticationStatus = chipAuthenticationStatus;
        }
    }

    /* compiled from: ComponentParam.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", PlaceTypes.COUNTRY, "", "type", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getType", "getValue", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class InternationalDbParams extends ComponentParam {
        public static final Parcelable.Creator<InternationalDbParams> CREATOR = new Creator();
        private final String country;
        private final String type;
        private final String value;

        /* compiled from: ComponentParam.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InternationalDbParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InternationalDbParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternationalDbParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InternationalDbParams[] newArray(int i) {
                return new InternationalDbParams[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.country);
            dest.writeString(this.type);
            dest.writeString(this.value);
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public InternationalDbParams(String str, String str2, String str3) {
            super(null);
            this.country = str;
            this.type = str2;
            this.value = str3;
        }
    }
}
