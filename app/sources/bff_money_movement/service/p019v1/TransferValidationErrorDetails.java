package bff_money_movement.service.p019v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: TransferValidationErrorDetails.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JJ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferValidationErrorDetails;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "markdown_actions", "", "Lbff_money_movement/service/v1/TransferAction;", CarResultComposable2.BUTTONS, "", "Lbff_money_movement/service/v1/TransferButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getMarkdown_actions", "()Ljava/util/Map;", "getButtons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class TransferValidationErrorDetails extends Message {

    @WireField(adapter = "bff_money_movement.service.v1.TransferButton#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<TransferButton> buttons;

    @WireField(adapter = "bff_money_movement.service.v1.TransferAction#ADAPTER", jsonName = "markdownActions", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final Map<String, TransferAction> markdown_actions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @JvmField
    public static final ProtoAdapter<TransferValidationErrorDetails> ADAPTER = new TransferValidationErrorDetails2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(TransferValidationErrorDetails.class), Syntax.PROTO_3);

    public TransferValidationErrorDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ TransferValidationErrorDetails(String str, String str2, Map map, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8522newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferValidationErrorDetails(String title, String subtitle, Map<String, TransferAction> markdown_actions, List<TransferButton> buttons, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(markdown_actions, "markdown_actions");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.markdown_actions = Internal.immutableCopyOf("markdown_actions", markdown_actions);
        this.buttons = Internal.immutableCopyOf(CarResultComposable2.BUTTONS, buttons);
    }

    public final Map<String, TransferAction> getMarkdown_actions() {
        return this.markdown_actions;
    }

    public final List<TransferButton> getButtons() {
        return this.buttons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8522newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TransferValidationErrorDetails)) {
            return false;
        }
        TransferValidationErrorDetails transferValidationErrorDetails = (TransferValidationErrorDetails) other;
        return Intrinsics.areEqual(unknownFields(), transferValidationErrorDetails.unknownFields()) && Intrinsics.areEqual(this.title, transferValidationErrorDetails.title) && Intrinsics.areEqual(this.subtitle, transferValidationErrorDetails.subtitle) && Intrinsics.areEqual(this.markdown_actions, transferValidationErrorDetails.markdown_actions) && Intrinsics.areEqual(this.buttons, transferValidationErrorDetails.buttons);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.markdown_actions.hashCode()) * 37) + this.buttons.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.markdown_actions.isEmpty()) {
            arrayList.add("markdown_actions=" + this.markdown_actions);
        }
        if (!this.buttons.isEmpty()) {
            arrayList.add("buttons=" + this.buttons);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferValidationErrorDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TransferValidationErrorDetails copy$default(TransferValidationErrorDetails transferValidationErrorDetails, String str, String str2, Map map, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferValidationErrorDetails.title;
        }
        if ((i & 2) != 0) {
            str2 = transferValidationErrorDetails.subtitle;
        }
        if ((i & 4) != 0) {
            map = transferValidationErrorDetails.markdown_actions;
        }
        if ((i & 8) != 0) {
            list = transferValidationErrorDetails.buttons;
        }
        if ((i & 16) != 0) {
            byteString = transferValidationErrorDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        Map map2 = map;
        return transferValidationErrorDetails.copy(str, str2, map2, list, byteString2);
    }

    public final TransferValidationErrorDetails copy(String title, String subtitle, Map<String, TransferAction> markdown_actions, List<TransferButton> buttons, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(markdown_actions, "markdown_actions");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TransferValidationErrorDetails(title, subtitle, markdown_actions, buttons, unknownFields);
    }
}
