package redesign_settings.p528v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetHighlightSettingsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001cR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001c¨\u00060"}, m3636d2 = {"Lredesign_settings/v1/GetHighlightSettingsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lredesign_settings/v1/GetHighlightSettingsResponse;", "Landroid/os/Parcelable;", "Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate;", "surrogate", "<init>", "(Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate;)V", "", "price_movement_threshold", "", "risk_score_threshold", "max_top_movers_highlights_displayed", "min_highlights_required_for_display", "max_highlights_displayed", "min_equity_holdings_for_display", "(FIIIII)V", "toProto", "()Lredesign_settings/v1/GetHighlightSettingsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate;", "getPrice_movement_threshold", "()F", "getRisk_score_threshold", "getMax_top_movers_highlights_displayed", "getMin_highlights_required_for_display", "getMax_highlights_displayed", "getMin_equity_holdings_for_display", "Companion", "Surrogate", "Serializer", "MultibindingModule", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class GetHighlightSettingsResponseDto implements Dto3<GetHighlightSettingsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetHighlightSettingsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetHighlightSettingsResponseDto, GetHighlightSettingsResponse>> binaryBase64Serializer$delegate;
    private static final GetHighlightSettingsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetHighlightSettingsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetHighlightSettingsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final float getPrice_movement_threshold() {
        return this.surrogate.getPrice_movement_threshold();
    }

    public final int getRisk_score_threshold() {
        return this.surrogate.getRisk_score_threshold();
    }

    public final int getMax_top_movers_highlights_displayed() {
        return this.surrogate.getMax_top_movers_highlights_displayed();
    }

    public final int getMin_highlights_required_for_display() {
        return this.surrogate.getMin_highlights_required_for_display();
    }

    public final int getMax_highlights_displayed() {
        return this.surrogate.getMax_highlights_displayed();
    }

    public final int getMin_equity_holdings_for_display() {
        return this.surrogate.getMin_equity_holdings_for_display();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetHighlightSettingsResponseDto(float r2, int r3, int r4, int r5, int r6, int r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L26
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2d
        L26:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2d:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: redesign_settings.p528v1.GetHighlightSettingsResponseDto.<init>(float, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public GetHighlightSettingsResponseDto(float f, int i, int i2, int i3, int i4, int i5) {
        this(new Surrogate(f, i, i2, i3, i4, i5));
    }

    @Override // com.robinhood.idl.Dto
    public GetHighlightSettingsResponse toProto() {
        return new GetHighlightSettingsResponse(this.surrogate.getPrice_movement_threshold(), this.surrogate.getRisk_score_threshold(), this.surrogate.getMax_top_movers_highlights_displayed(), this.surrogate.getMin_highlights_required_for_display(), this.surrogate.getMax_highlights_displayed(), this.surrogate.getMin_equity_holdings_for_display(), null, 64, null);
    }

    public String toString() {
        return "[GetHighlightSettingsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetHighlightSettingsResponseDto) && Intrinsics.areEqual(((GetHighlightSettingsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetHighlightSettingsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276B\u009d\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R/\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010!R/\u0010\n\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010!R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010+\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010!R/\u0010\f\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010+\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010!R/\u0010\r\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010+\u0012\u0004\b5\u0010*\u001a\u0004\b4\u0010!¨\u00068"}, m3636d2 = {"Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "price_movement_threshold", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "risk_score_threshold", "max_top_movers_highlights_displayed", "min_highlights_required_for_display", "max_highlights_displayed", "min_equity_holdings_for_display", "<init>", "(FIIIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$redesign_settings_v1_externalRelease", "(Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getPrice_movement_threshold", "()F", "getPrice_movement_threshold$annotations", "()V", "I", "getRisk_score_threshold", "getRisk_score_threshold$annotations", "getMax_top_movers_highlights_displayed", "getMax_top_movers_highlights_displayed$annotations", "getMin_highlights_required_for_display", "getMin_highlights_required_for_display$annotations", "getMax_highlights_displayed", "getMax_highlights_displayed$annotations", "getMin_equity_holdings_for_display", "getMin_equity_holdings_for_display$annotations", "Companion", "$serializer", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int max_highlights_displayed;
        private final int max_top_movers_highlights_displayed;
        private final int min_equity_holdings_for_display;
        private final int min_highlights_required_for_display;
        private final float price_movement_threshold;
        private final int risk_score_threshold;

        public Surrogate() {
            this(0.0f, 0, 0, 0, 0, 0, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Float.compare(this.price_movement_threshold, surrogate.price_movement_threshold) == 0 && this.risk_score_threshold == surrogate.risk_score_threshold && this.max_top_movers_highlights_displayed == surrogate.max_top_movers_highlights_displayed && this.min_highlights_required_for_display == surrogate.min_highlights_required_for_display && this.max_highlights_displayed == surrogate.max_highlights_displayed && this.min_equity_holdings_for_display == surrogate.min_equity_holdings_for_display;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.price_movement_threshold) * 31) + Integer.hashCode(this.risk_score_threshold)) * 31) + Integer.hashCode(this.max_top_movers_highlights_displayed)) * 31) + Integer.hashCode(this.min_highlights_required_for_display)) * 31) + Integer.hashCode(this.max_highlights_displayed)) * 31) + Integer.hashCode(this.min_equity_holdings_for_display);
        }

        public String toString() {
            return "Surrogate(price_movement_threshold=" + this.price_movement_threshold + ", risk_score_threshold=" + this.risk_score_threshold + ", max_top_movers_highlights_displayed=" + this.max_top_movers_highlights_displayed + ", min_highlights_required_for_display=" + this.min_highlights_required_for_display + ", max_highlights_displayed=" + this.max_highlights_displayed + ", min_equity_holdings_for_display=" + this.min_equity_holdings_for_display + ")";
        }

        /* compiled from: GetHighlightSettingsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate;", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetHighlightSettingsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, float f, int i2, int i3, int i4, int i5, int i6, SerializationConstructorMarker serializationConstructorMarker) {
            this.price_movement_threshold = (i & 1) == 0 ? 0.0f : f;
            if ((i & 2) == 0) {
                this.risk_score_threshold = 0;
            } else {
                this.risk_score_threshold = i2;
            }
            if ((i & 4) == 0) {
                this.max_top_movers_highlights_displayed = 0;
            } else {
                this.max_top_movers_highlights_displayed = i3;
            }
            if ((i & 8) == 0) {
                this.min_highlights_required_for_display = 0;
            } else {
                this.min_highlights_required_for_display = i4;
            }
            if ((i & 16) == 0) {
                this.max_highlights_displayed = 0;
            } else {
                this.max_highlights_displayed = i5;
            }
            if ((i & 32) == 0) {
                this.min_equity_holdings_for_display = 0;
            } else {
                this.min_equity_holdings_for_display = i6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$redesign_settings_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Float.compare(self.price_movement_threshold, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 0, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.price_movement_threshold));
            }
            int i = self.risk_score_threshold;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.max_top_movers_highlights_displayed;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.min_highlights_required_for_display;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            int i4 = self.max_highlights_displayed;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            int i5 = self.min_equity_holdings_for_display;
            if (i5 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i5));
            }
        }

        public Surrogate(float f, int i, int i2, int i3, int i4, int i5) {
            this.price_movement_threshold = f;
            this.risk_score_threshold = i;
            this.max_top_movers_highlights_displayed = i2;
            this.min_highlights_required_for_display = i3;
            this.max_highlights_displayed = i4;
            this.min_equity_holdings_for_display = i5;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(float r2, int r3, int r4, int r5, int r6, int r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r2 = 0
            L5:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Lb
                r3 = r0
            Lb:
                r9 = r8 & 4
                if (r9 == 0) goto L10
                r4 = r0
            L10:
                r9 = r8 & 8
                if (r9 == 0) goto L15
                r5 = r0
            L15:
                r9 = r8 & 16
                if (r9 == 0) goto L1a
                r6 = r0
            L1a:
                r8 = r8 & 32
                if (r8 == 0) goto L26
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2d
            L26:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2d:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: redesign_settings.p528v1.GetHighlightSettingsResponseDto.Surrogate.<init>(float, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final float getPrice_movement_threshold() {
            return this.price_movement_threshold;
        }

        public final int getRisk_score_threshold() {
            return this.risk_score_threshold;
        }

        public final int getMax_top_movers_highlights_displayed() {
            return this.max_top_movers_highlights_displayed;
        }

        public final int getMin_highlights_required_for_display() {
            return this.min_highlights_required_for_display;
        }

        public final int getMax_highlights_displayed() {
            return this.max_highlights_displayed;
        }

        public final int getMin_equity_holdings_for_display() {
            return this.min_equity_holdings_for_display;
        }
    }

    /* compiled from: GetHighlightSettingsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lredesign_settings/v1/GetHighlightSettingsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lredesign_settings/v1/GetHighlightSettingsResponseDto;", "Lredesign_settings/v1/GetHighlightSettingsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lredesign_settings/v1/GetHighlightSettingsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetHighlightSettingsResponseDto, GetHighlightSettingsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetHighlightSettingsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetHighlightSettingsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetHighlightSettingsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetHighlightSettingsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetHighlightSettingsResponse> getProtoAdapter() {
            return GetHighlightSettingsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetHighlightSettingsResponseDto getZeroValue() {
            return GetHighlightSettingsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetHighlightSettingsResponseDto fromProto(GetHighlightSettingsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetHighlightSettingsResponseDto(new Surrogate(proto.getPrice_movement_threshold(), proto.getRisk_score_threshold(), proto.getMax_top_movers_highlights_displayed(), proto.getMin_highlights_required_for_display(), proto.getMax_highlights_displayed(), proto.getMin_equity_holdings_for_display()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: redesign_settings.v1.GetHighlightSettingsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetHighlightSettingsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetHighlightSettingsResponseDto(0.0f, 0, 0, 0, 0, 0, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetHighlightSettingsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lredesign_settings/v1/GetHighlightSettingsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lredesign_settings/v1/GetHighlightSettingsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lredesign_settings/v1/GetHighlightSettingsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetHighlightSettingsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/redesign_settings.v1.GetHighlightSettingsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetHighlightSettingsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetHighlightSettingsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetHighlightSettingsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetHighlightSettingsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lredesign_settings/v1/GetHighlightSettingsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "redesign_settings.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "redesign_settings.v1.GetHighlightSettingsResponseDto";
        }
    }
}
