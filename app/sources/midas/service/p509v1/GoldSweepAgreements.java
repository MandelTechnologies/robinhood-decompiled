package midas.service.p509v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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

/* compiled from: GoldSweepAgreements.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016JÀ\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u00065"}, m3636d2 = {"Lmidas/service/v1/GoldSweepAgreements;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "gold_title", "gold_description_markdown", "gold_description_cta", "gold_full_agreement", "Lmidas/service/v1/Agreement;", "sweep_title", "sweep_description_markdown", "sweep_description_cta", "sweep_full_agreement", "disclaimer_markdown", "cta_text", "secondary_cta_text", "web_sidebar_title", "web_sidebar_description", "web_sidebar_infotag", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/Agreement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmidas/service/v1/Agreement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getGold_title", "getGold_description_markdown", "getGold_description_cta", "getGold_full_agreement", "()Lmidas/service/v1/Agreement;", "getSweep_title", "getSweep_description_markdown", "getSweep_description_cta", "getSweep_full_agreement", "getDisclaimer_markdown", "getCta_text", "getSecondary_cta_text", "getWeb_sidebar_title", "getWeb_sidebar_description", "getWeb_sidebar_infotag", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GoldSweepAgreements extends Message {

    @JvmField
    public static final ProtoAdapter<GoldSweepAgreements> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String disclaimer_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String gold_description_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String gold_description_markdown;

    @WireField(adapter = "midas.service.v1.Agreement#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Agreement gold_full_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String gold_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    private final String secondary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    private final String sweep_description_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String sweep_description_markdown;

    @WireField(adapter = "midas.service.v1.Agreement#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Agreement sweep_full_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String sweep_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 15)
    private final String web_sidebar_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 16)
    private final String web_sidebar_infotag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    private final String web_sidebar_title;

    public GoldSweepAgreements() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public /* synthetic */ GoldSweepAgreements(String str, String str2, String str3, String str4, String str5, Agreement agreement, String str6, String str7, String str8, Agreement agreement2, String str9, String str10, String str11, String str12, String str13, String str14, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : agreement, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : agreement2, (i & 1024) != 0 ? "" : str9, (i & 2048) == 0 ? str10 : "", (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29318newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGold_title() {
        return this.gold_title;
    }

    public final String getGold_description_markdown() {
        return this.gold_description_markdown;
    }

    public final String getGold_description_cta() {
        return this.gold_description_cta;
    }

    public final Agreement getGold_full_agreement() {
        return this.gold_full_agreement;
    }

    public final String getSweep_title() {
        return this.sweep_title;
    }

    public final String getSweep_description_markdown() {
        return this.sweep_description_markdown;
    }

    public final String getSweep_description_cta() {
        return this.sweep_description_cta;
    }

    public final Agreement getSweep_full_agreement() {
        return this.sweep_full_agreement;
    }

    public final String getDisclaimer_markdown() {
        return this.disclaimer_markdown;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getSecondary_cta_text() {
        return this.secondary_cta_text;
    }

    public final String getWeb_sidebar_title() {
        return this.web_sidebar_title;
    }

    public final String getWeb_sidebar_description() {
        return this.web_sidebar_description;
    }

    public final String getWeb_sidebar_infotag() {
        return this.web_sidebar_infotag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSweepAgreements(String title, String description, String gold_title, String gold_description_markdown, String str, Agreement agreement, String sweep_title, String sweep_description_markdown, String str2, Agreement agreement2, String disclaimer_markdown, String cta_text, String str3, String str4, String str5, String str6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(gold_title, "gold_title");
        Intrinsics.checkNotNullParameter(gold_description_markdown, "gold_description_markdown");
        Intrinsics.checkNotNullParameter(sweep_title, "sweep_title");
        Intrinsics.checkNotNullParameter(sweep_description_markdown, "sweep_description_markdown");
        Intrinsics.checkNotNullParameter(disclaimer_markdown, "disclaimer_markdown");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.gold_title = gold_title;
        this.gold_description_markdown = gold_description_markdown;
        this.gold_description_cta = str;
        this.gold_full_agreement = agreement;
        this.sweep_title = sweep_title;
        this.sweep_description_markdown = sweep_description_markdown;
        this.sweep_description_cta = str2;
        this.sweep_full_agreement = agreement2;
        this.disclaimer_markdown = disclaimer_markdown;
        this.cta_text = cta_text;
        this.secondary_cta_text = str3;
        this.web_sidebar_title = str4;
        this.web_sidebar_description = str5;
        this.web_sidebar_infotag = str6;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29318newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldSweepAgreements)) {
            return false;
        }
        GoldSweepAgreements goldSweepAgreements = (GoldSweepAgreements) other;
        return Intrinsics.areEqual(unknownFields(), goldSweepAgreements.unknownFields()) && Intrinsics.areEqual(this.title, goldSweepAgreements.title) && Intrinsics.areEqual(this.description, goldSweepAgreements.description) && Intrinsics.areEqual(this.gold_title, goldSweepAgreements.gold_title) && Intrinsics.areEqual(this.gold_description_markdown, goldSweepAgreements.gold_description_markdown) && Intrinsics.areEqual(this.gold_description_cta, goldSweepAgreements.gold_description_cta) && Intrinsics.areEqual(this.gold_full_agreement, goldSweepAgreements.gold_full_agreement) && Intrinsics.areEqual(this.sweep_title, goldSweepAgreements.sweep_title) && Intrinsics.areEqual(this.sweep_description_markdown, goldSweepAgreements.sweep_description_markdown) && Intrinsics.areEqual(this.sweep_description_cta, goldSweepAgreements.sweep_description_cta) && Intrinsics.areEqual(this.sweep_full_agreement, goldSweepAgreements.sweep_full_agreement) && Intrinsics.areEqual(this.disclaimer_markdown, goldSweepAgreements.disclaimer_markdown) && Intrinsics.areEqual(this.cta_text, goldSweepAgreements.cta_text) && Intrinsics.areEqual(this.secondary_cta_text, goldSweepAgreements.secondary_cta_text) && Intrinsics.areEqual(this.web_sidebar_title, goldSweepAgreements.web_sidebar_title) && Intrinsics.areEqual(this.web_sidebar_description, goldSweepAgreements.web_sidebar_description) && Intrinsics.areEqual(this.web_sidebar_infotag, goldSweepAgreements.web_sidebar_infotag);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.gold_title.hashCode()) * 37) + this.gold_description_markdown.hashCode()) * 37;
        String str = this.gold_description_cta;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Agreement agreement = this.gold_full_agreement;
        int iHashCode3 = (((((iHashCode2 + (agreement != null ? agreement.hashCode() : 0)) * 37) + this.sweep_title.hashCode()) * 37) + this.sweep_description_markdown.hashCode()) * 37;
        String str2 = this.sweep_description_cta;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Agreement agreement2 = this.sweep_full_agreement;
        int iHashCode5 = (((((iHashCode4 + (agreement2 != null ? agreement2.hashCode() : 0)) * 37) + this.disclaimer_markdown.hashCode()) * 37) + this.cta_text.hashCode()) * 37;
        String str3 = this.secondary_cta_text;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.web_sidebar_title;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.web_sidebar_description;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.web_sidebar_infotag;
        int iHashCode9 = iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("gold_title=" + Internal.sanitize(this.gold_title));
        arrayList.add("gold_description_markdown=" + Internal.sanitize(this.gold_description_markdown));
        String str = this.gold_description_cta;
        if (str != null) {
            arrayList.add("gold_description_cta=" + Internal.sanitize(str));
        }
        Agreement agreement = this.gold_full_agreement;
        if (agreement != null) {
            arrayList.add("gold_full_agreement=" + agreement);
        }
        arrayList.add("sweep_title=" + Internal.sanitize(this.sweep_title));
        arrayList.add("sweep_description_markdown=" + Internal.sanitize(this.sweep_description_markdown));
        String str2 = this.sweep_description_cta;
        if (str2 != null) {
            arrayList.add("sweep_description_cta=" + Internal.sanitize(str2));
        }
        Agreement agreement2 = this.sweep_full_agreement;
        if (agreement2 != null) {
            arrayList.add("sweep_full_agreement=" + agreement2);
        }
        arrayList.add("disclaimer_markdown=" + Internal.sanitize(this.disclaimer_markdown));
        arrayList.add("cta_text=" + Internal.sanitize(this.cta_text));
        String str3 = this.secondary_cta_text;
        if (str3 != null) {
            arrayList.add("secondary_cta_text=" + Internal.sanitize(str3));
        }
        String str4 = this.web_sidebar_title;
        if (str4 != null) {
            arrayList.add("web_sidebar_title=" + Internal.sanitize(str4));
        }
        String str5 = this.web_sidebar_description;
        if (str5 != null) {
            arrayList.add("web_sidebar_description=" + Internal.sanitize(str5));
        }
        String str6 = this.web_sidebar_infotag;
        if (str6 != null) {
            arrayList.add("web_sidebar_infotag=" + Internal.sanitize(str6));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldSweepAgreements{", "}", 0, null, null, 56, null);
    }

    public final GoldSweepAgreements copy(String title, String description, String gold_title, String gold_description_markdown, String gold_description_cta, Agreement gold_full_agreement, String sweep_title, String sweep_description_markdown, String sweep_description_cta, Agreement sweep_full_agreement, String disclaimer_markdown, String cta_text, String secondary_cta_text, String web_sidebar_title, String web_sidebar_description, String web_sidebar_infotag, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(gold_title, "gold_title");
        Intrinsics.checkNotNullParameter(gold_description_markdown, "gold_description_markdown");
        Intrinsics.checkNotNullParameter(sweep_title, "sweep_title");
        Intrinsics.checkNotNullParameter(sweep_description_markdown, "sweep_description_markdown");
        Intrinsics.checkNotNullParameter(disclaimer_markdown, "disclaimer_markdown");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldSweepAgreements(title, description, gold_title, gold_description_markdown, gold_description_cta, gold_full_agreement, sweep_title, sweep_description_markdown, sweep_description_cta, sweep_full_agreement, disclaimer_markdown, cta_text, secondary_cta_text, web_sidebar_title, web_sidebar_description, web_sidebar_infotag, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldSweepAgreements.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldSweepAgreements>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.GoldSweepAgreements$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldSweepAgreements value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getGold_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getGold_title());
                }
                if (!Intrinsics.areEqual(value.getGold_description_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getGold_description_markdown());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(5, value.getGold_description_cta());
                if (value.getGold_full_agreement() != null) {
                    iEncodedSizeWithTag += Agreement.ADAPTER.encodedSizeWithTag(6, value.getGold_full_agreement());
                }
                if (!Intrinsics.areEqual(value.getSweep_title(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getSweep_title());
                }
                if (!Intrinsics.areEqual(value.getSweep_description_markdown(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getSweep_description_markdown());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, value.getSweep_description_cta());
                if (value.getSweep_full_agreement() != null) {
                    iEncodedSizeWithTag2 += Agreement.ADAPTER.encodedSizeWithTag(10, value.getSweep_full_agreement());
                }
                if (!Intrinsics.areEqual(value.getDisclaimer_markdown(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(11, value.getDisclaimer_markdown());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(12, value.getCta_text());
                }
                return iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(13, value.getSecondary_cta_text()) + protoAdapter.encodedSizeWithTag(14, value.getWeb_sidebar_title()) + protoAdapter.encodedSizeWithTag(15, value.getWeb_sidebar_description()) + protoAdapter.encodedSizeWithTag(16, value.getWeb_sidebar_infotag());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldSweepAgreements value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getGold_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getGold_title());
                }
                if (!Intrinsics.areEqual(value.getGold_description_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getGold_description_markdown());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getGold_description_cta());
                if (value.getGold_full_agreement() != null) {
                    Agreement.ADAPTER.encodeWithTag(writer, 6, (int) value.getGold_full_agreement());
                }
                if (!Intrinsics.areEqual(value.getSweep_title(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getSweep_title());
                }
                if (!Intrinsics.areEqual(value.getSweep_description_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getSweep_description_markdown());
                }
                protoAdapter.encodeWithTag(writer, 9, (int) value.getSweep_description_cta());
                if (value.getSweep_full_agreement() != null) {
                    Agreement.ADAPTER.encodeWithTag(writer, 10, (int) value.getSweep_full_agreement());
                }
                if (!Intrinsics.areEqual(value.getDisclaimer_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getDisclaimer_markdown());
                }
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getCta_text());
                }
                protoAdapter.encodeWithTag(writer, 13, (int) value.getSecondary_cta_text());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getWeb_sidebar_title());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getWeb_sidebar_description());
                protoAdapter.encodeWithTag(writer, 16, (int) value.getWeb_sidebar_infotag());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldSweepAgreements value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 16, (int) value.getWeb_sidebar_infotag());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getWeb_sidebar_description());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getWeb_sidebar_title());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getSecondary_cta_text());
                if (!Intrinsics.areEqual(value.getCta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getCta_text());
                }
                if (!Intrinsics.areEqual(value.getDisclaimer_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getDisclaimer_markdown());
                }
                if (value.getSweep_full_agreement() != null) {
                    Agreement.ADAPTER.encodeWithTag(writer, 10, (int) value.getSweep_full_agreement());
                }
                protoAdapter.encodeWithTag(writer, 9, (int) value.getSweep_description_cta());
                if (!Intrinsics.areEqual(value.getSweep_description_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getSweep_description_markdown());
                }
                if (!Intrinsics.areEqual(value.getSweep_title(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getSweep_title());
                }
                if (value.getGold_full_agreement() != null) {
                    Agreement.ADAPTER.encodeWithTag(writer, 6, (int) value.getGold_full_agreement());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getGold_description_cta());
                if (!Intrinsics.areEqual(value.getGold_description_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getGold_description_markdown());
                }
                if (!Intrinsics.areEqual(value.getGold_title(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getGold_title());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldSweepAgreements redact(GoldSweepAgreements value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Agreement gold_full_agreement = value.getGold_full_agreement();
                Agreement agreementRedact = gold_full_agreement != null ? Agreement.ADAPTER.redact(gold_full_agreement) : null;
                Agreement sweep_full_agreement = value.getSweep_full_agreement();
                return value.copy((64991 & 1) != 0 ? value.title : null, (64991 & 2) != 0 ? value.description : null, (64991 & 4) != 0 ? value.gold_title : null, (64991 & 8) != 0 ? value.gold_description_markdown : null, (64991 & 16) != 0 ? value.gold_description_cta : null, (64991 & 32) != 0 ? value.gold_full_agreement : agreementRedact, (64991 & 64) != 0 ? value.sweep_title : null, (64991 & 128) != 0 ? value.sweep_description_markdown : null, (64991 & 256) != 0 ? value.sweep_description_cta : null, (64991 & 512) != 0 ? value.sweep_full_agreement : sweep_full_agreement != null ? Agreement.ADAPTER.redact(sweep_full_agreement) : null, (64991 & 1024) != 0 ? value.disclaimer_markdown : null, (64991 & 2048) != 0 ? value.cta_text : null, (64991 & 4096) != 0 ? value.secondary_cta_text : null, (64991 & 8192) != 0 ? value.web_sidebar_title : null, (64991 & 16384) != 0 ? value.web_sidebar_description : null, (64991 & 32768) != 0 ? value.web_sidebar_infotag : null, (64991 & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldSweepAgreements decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = null;
                Agreement agreementDecode = null;
                String strDecode9 = null;
                Agreement agreementDecode2 = null;
                String strDecode10 = null;
                String strDecode11 = null;
                String strDecode12 = null;
                String strDecode13 = null;
                String strDecode14 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode14;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                agreementDecode = Agreement.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                agreementDecode2 = Agreement.ADAPTER.decode(reader);
                                break;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode14 = str;
                    } else {
                        return new GoldSweepAgreements(strDecode7, str, strDecode, strDecode2, strDecode8, agreementDecode, strDecode3, strDecode4, strDecode9, agreementDecode2, strDecode5, strDecode6, strDecode10, strDecode11, strDecode12, strDecode13, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
