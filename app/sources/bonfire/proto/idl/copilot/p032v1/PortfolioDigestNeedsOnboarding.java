package bonfire.proto.idl.copilot.p032v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PortfolioDigestNeedsOnboarding.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreview;", "agreement", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreement;", "splash", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplash;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreview;Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreement;Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplash;Lokio/ByteString;)V", "getPreview", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreview;", "getAgreement", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreement;", "getSplash", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplash;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PortfolioDigestNeedsOnboarding extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioDigestNeedsOnboarding> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestAgreement#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PortfolioDigestAgreement agreement;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestPreview#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PortfolioDigestPreview preview;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestSplash#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PortfolioDigestSplash splash;

    public PortfolioDigestNeedsOnboarding() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8887newBuilder();
    }

    public final PortfolioDigestPreview getPreview() {
        return this.preview;
    }

    public final PortfolioDigestAgreement getAgreement() {
        return this.agreement;
    }

    public final PortfolioDigestSplash getSplash() {
        return this.splash;
    }

    public /* synthetic */ PortfolioDigestNeedsOnboarding(PortfolioDigestPreview portfolioDigestPreview, PortfolioDigestAgreement portfolioDigestAgreement, PortfolioDigestSplash portfolioDigestSplash, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : portfolioDigestPreview, (i & 2) != 0 ? null : portfolioDigestAgreement, (i & 4) != 0 ? null : portfolioDigestSplash, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestNeedsOnboarding(PortfolioDigestPreview portfolioDigestPreview, PortfolioDigestAgreement portfolioDigestAgreement, PortfolioDigestSplash portfolioDigestSplash, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.preview = portfolioDigestPreview;
        this.agreement = portfolioDigestAgreement;
        this.splash = portfolioDigestSplash;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8887newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioDigestNeedsOnboarding)) {
            return false;
        }
        PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboarding = (PortfolioDigestNeedsOnboarding) other;
        return Intrinsics.areEqual(unknownFields(), portfolioDigestNeedsOnboarding.unknownFields()) && Intrinsics.areEqual(this.preview, portfolioDigestNeedsOnboarding.preview) && Intrinsics.areEqual(this.agreement, portfolioDigestNeedsOnboarding.agreement) && Intrinsics.areEqual(this.splash, portfolioDigestNeedsOnboarding.splash);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PortfolioDigestPreview portfolioDigestPreview = this.preview;
        int iHashCode2 = (iHashCode + (portfolioDigestPreview != null ? portfolioDigestPreview.hashCode() : 0)) * 37;
        PortfolioDigestAgreement portfolioDigestAgreement = this.agreement;
        int iHashCode3 = (iHashCode2 + (portfolioDigestAgreement != null ? portfolioDigestAgreement.hashCode() : 0)) * 37;
        PortfolioDigestSplash portfolioDigestSplash = this.splash;
        int iHashCode4 = iHashCode3 + (portfolioDigestSplash != null ? portfolioDigestSplash.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PortfolioDigestPreview portfolioDigestPreview = this.preview;
        if (portfolioDigestPreview != null) {
            arrayList.add("preview=" + portfolioDigestPreview);
        }
        PortfolioDigestAgreement portfolioDigestAgreement = this.agreement;
        if (portfolioDigestAgreement != null) {
            arrayList.add("agreement=" + portfolioDigestAgreement);
        }
        PortfolioDigestSplash portfolioDigestSplash = this.splash;
        if (portfolioDigestSplash != null) {
            arrayList.add("splash=" + portfolioDigestSplash);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioDigestNeedsOnboarding{", "}", 0, null, null, 56, null);
    }

    public final PortfolioDigestNeedsOnboarding copy(PortfolioDigestPreview preview, PortfolioDigestAgreement agreement, PortfolioDigestSplash splash, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioDigestNeedsOnboarding(preview, agreement, splash, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigestNeedsOnboarding.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioDigestNeedsOnboarding>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestNeedsOnboarding$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioDigestNeedsOnboarding value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPreview() != null) {
                    size += PortfolioDigestPreview.ADAPTER.encodedSizeWithTag(1, value.getPreview());
                }
                if (value.getAgreement() != null) {
                    size += PortfolioDigestAgreement.ADAPTER.encodedSizeWithTag(2, value.getAgreement());
                }
                return value.getSplash() != null ? size + PortfolioDigestSplash.ADAPTER.encodedSizeWithTag(3, value.getSplash()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioDigestNeedsOnboarding value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPreview() != null) {
                    PortfolioDigestPreview.ADAPTER.encodeWithTag(writer, 1, (int) value.getPreview());
                }
                if (value.getAgreement() != null) {
                    PortfolioDigestAgreement.ADAPTER.encodeWithTag(writer, 2, (int) value.getAgreement());
                }
                if (value.getSplash() != null) {
                    PortfolioDigestSplash.ADAPTER.encodeWithTag(writer, 3, (int) value.getSplash());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioDigestNeedsOnboarding value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSplash() != null) {
                    PortfolioDigestSplash.ADAPTER.encodeWithTag(writer, 3, (int) value.getSplash());
                }
                if (value.getAgreement() != null) {
                    PortfolioDigestAgreement.ADAPTER.encodeWithTag(writer, 2, (int) value.getAgreement());
                }
                if (value.getPreview() != null) {
                    PortfolioDigestPreview.ADAPTER.encodeWithTag(writer, 1, (int) value.getPreview());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestNeedsOnboarding redact(PortfolioDigestNeedsOnboarding value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PortfolioDigestPreview preview = value.getPreview();
                PortfolioDigestPreview portfolioDigestPreviewRedact = preview != null ? PortfolioDigestPreview.ADAPTER.redact(preview) : null;
                PortfolioDigestAgreement agreement = value.getAgreement();
                PortfolioDigestAgreement portfolioDigestAgreementRedact = agreement != null ? PortfolioDigestAgreement.ADAPTER.redact(agreement) : null;
                PortfolioDigestSplash splash = value.getSplash();
                return value.copy(portfolioDigestPreviewRedact, portfolioDigestAgreementRedact, splash != null ? PortfolioDigestSplash.ADAPTER.redact(splash) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestNeedsOnboarding decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PortfolioDigestPreview portfolioDigestPreviewDecode = null;
                PortfolioDigestAgreement portfolioDigestAgreementDecode = null;
                PortfolioDigestSplash portfolioDigestSplashDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PortfolioDigestNeedsOnboarding(portfolioDigestPreviewDecode, portfolioDigestAgreementDecode, portfolioDigestSplashDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        portfolioDigestPreviewDecode = PortfolioDigestPreview.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        portfolioDigestAgreementDecode = PortfolioDigestAgreement.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        portfolioDigestSplashDecode = PortfolioDigestSplash.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
