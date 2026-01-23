package rh_server_driven_ui.p531v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.TextInput;

/* compiled from: TextInput.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\nBCDEFGHIJKB\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010:\u001a\u00020\u0002H\u0017J\u0013\u0010;\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010=H\u0096\u0002J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\bH\u0016J¬\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010'R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0016\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006L"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput;", "Lcom/squareup/wire/Message;", "", "state", "Lrh_server_driven_ui/v1/TextInput$State;", "size", "Lrh_server_driven_ui/v1/TextInput$Size;", "placeholder_text", "", "is_disabled", "", AnnotatedPrivateKey.LABEL, "hide_label", "toolbar", "Lrh_server_driven_ui/v1/TextInput$Toolbar;", "keyboard_type", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "autocorrection_type", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "autocapitalization_type", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "activate_keyboard_on_appear", "identifier", "placeholder_formatter", "Lrh_server_driven_ui/v1/TextInput$PlaceholderFormatter;", "currency_formatter", "Lrh_server_driven_ui/v1/TextInput$CurrencyFormatter;", "leading_icon", "Lrh_server_driven_ui/v1/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/TextInput$State;Lrh_server_driven_ui/v1/TextInput$Size;Ljava/lang/String;ZLjava/lang/String;ZLrh_server_driven_ui/v1/TextInput$Toolbar;Lrh_server_driven_ui/v1/TextInput$KeyboardType;Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;ZLjava/lang/String;Lrh_server_driven_ui/v1/TextInput$PlaceholderFormatter;Lrh_server_driven_ui/v1/TextInput$CurrencyFormatter;Lrh_server_driven_ui/v1/Icon;Lokio/ByteString;)V", "getState", "()Lrh_server_driven_ui/v1/TextInput$State;", "getSize", "()Lrh_server_driven_ui/v1/TextInput$Size;", "getPlaceholder_text", "()Ljava/lang/String;", "()Z", "getLabel", "getHide_label", "getToolbar", "()Lrh_server_driven_ui/v1/TextInput$Toolbar;", "getKeyboard_type", "()Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "getAutocorrection_type", "()Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "getAutocapitalization_type", "()Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "getActivate_keyboard_on_appear", "getIdentifier", "getPlaceholder_formatter", "()Lrh_server_driven_ui/v1/TextInput$PlaceholderFormatter;", "getCurrency_formatter", "()Lrh_server_driven_ui/v1/TextInput$CurrencyFormatter;", "getLeading_icon", "()Lrh_server_driven_ui/v1/Icon;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "State", "PlaceholderFormatter", "ValidCharacters", "CurrencyFormatter", "Toolbar", "Size", "KeyboardType", "AutoCorrectionType", "AutoCapitalizationType", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TextInput extends Message {

    @JvmField
    public static final ProtoAdapter<TextInput> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "activateKeyboardOnAppear", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 12)
    private final boolean activate_keyboard_on_appear;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$AutoCapitalizationType#ADAPTER", jsonName = "autocapitalizationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 11)
    private final AutoCapitalizationType autocapitalization_type;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$AutoCorrectionType#ADAPTER", jsonName = "autocorrectionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final AutoCorrectionType autocorrection_type;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$CurrencyFormatter#ADAPTER", jsonName = "currencyFormatter", oneofName = "formatter", schemaIndex = 13, tag = 15)
    private final CurrencyFormatter currency_formatter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hideLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean hide_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 13)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_disabled;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$KeyboardType#ADAPTER", jsonName = "keyboardType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final KeyboardType keyboard_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String label;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "leadingIcon", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 16)
    private final Icon leading_icon;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$PlaceholderFormatter#ADAPTER", jsonName = "placeholderFormatter", oneofName = "formatter", schemaIndex = 12, tag = 14)
    private final PlaceholderFormatter placeholder_formatter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "placeholderText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String placeholder_text;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$Size#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Size size;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final State state;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput$Toolbar#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final Toolbar toolbar;

    public TextInput() {
        this(null, null, null, false, null, false, null, null, null, null, false, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29834newBuilder();
    }

    public final State getState() {
        return this.state;
    }

    public final Size getSize() {
        return this.size;
    }

    public /* synthetic */ TextInput(State state, Size size, String str, boolean z, String str2, boolean z2, Toolbar toolbar, KeyboardType keyboardType, AutoCorrectionType autoCorrectionType, AutoCapitalizationType autoCapitalizationType, boolean z3, String str3, PlaceholderFormatter placeholderFormatter, CurrencyFormatter currencyFormatter, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : state, (i & 2) != 0 ? Size.SIZE_UNSPECIFIED : size, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? Toolbar.TOOLBAR_UNSPECIFIED : toolbar, (i & 128) != 0 ? KeyboardType.KEYBOARD_TYPE_UNSPECIFIED : keyboardType, (i & 256) != 0 ? AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED : autoCorrectionType, (i & 512) != 0 ? AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED : autoCapitalizationType, (i & 1024) == 0 ? z3 : false, (i & 2048) == 0 ? str3 : "", (i & 4096) != 0 ? null : placeholderFormatter, (i & 8192) == 0 ? currencyFormatter : null, (i & 16384) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPlaceholder_text() {
        return this.placeholder_text;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getHide_label() {
        return this.hide_label;
    }

    public final Toolbar getToolbar() {
        return this.toolbar;
    }

    public final KeyboardType getKeyboard_type() {
        return this.keyboard_type;
    }

    public final AutoCorrectionType getAutocorrection_type() {
        return this.autocorrection_type;
    }

    public final AutoCapitalizationType getAutocapitalization_type() {
        return this.autocapitalization_type;
    }

    public final boolean getActivate_keyboard_on_appear() {
        return this.activate_keyboard_on_appear;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final PlaceholderFormatter getPlaceholder_formatter() {
        return this.placeholder_formatter;
    }

    public final CurrencyFormatter getCurrency_formatter() {
        return this.currency_formatter;
    }

    public final Icon getLeading_icon() {
        return this.leading_icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInput(State state, Size size, String placeholder_text, boolean z, String label, boolean z2, Toolbar toolbar, KeyboardType keyboard_type, AutoCorrectionType autocorrection_type, AutoCapitalizationType autocapitalization_type, boolean z3, String identifier, PlaceholderFormatter placeholderFormatter, CurrencyFormatter currencyFormatter, Icon leading_icon, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placeholder_text, "placeholder_text");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(keyboard_type, "keyboard_type");
        Intrinsics.checkNotNullParameter(autocorrection_type, "autocorrection_type");
        Intrinsics.checkNotNullParameter(autocapitalization_type, "autocapitalization_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(leading_icon, "leading_icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
        this.size = size;
        this.placeholder_text = placeholder_text;
        this.is_disabled = z;
        this.label = label;
        this.hide_label = z2;
        this.toolbar = toolbar;
        this.keyboard_type = keyboard_type;
        this.autocorrection_type = autocorrection_type;
        this.autocapitalization_type = autocapitalization_type;
        this.activate_keyboard_on_appear = z3;
        this.identifier = identifier;
        this.placeholder_formatter = placeholderFormatter;
        this.currency_formatter = currencyFormatter;
        this.leading_icon = leading_icon;
        if (Internal.countNonNull(placeholderFormatter, currencyFormatter) > 1) {
            throw new IllegalArgumentException("At most one of placeholder_formatter, currency_formatter may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29834newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TextInput)) {
            return false;
        }
        TextInput textInput = (TextInput) other;
        return Intrinsics.areEqual(unknownFields(), textInput.unknownFields()) && Intrinsics.areEqual(this.state, textInput.state) && this.size == textInput.size && Intrinsics.areEqual(this.placeholder_text, textInput.placeholder_text) && this.is_disabled == textInput.is_disabled && Intrinsics.areEqual(this.label, textInput.label) && this.hide_label == textInput.hide_label && this.toolbar == textInput.toolbar && this.keyboard_type == textInput.keyboard_type && this.autocorrection_type == textInput.autocorrection_type && this.autocapitalization_type == textInput.autocapitalization_type && this.activate_keyboard_on_appear == textInput.activate_keyboard_on_appear && Intrinsics.areEqual(this.identifier, textInput.identifier) && Intrinsics.areEqual(this.placeholder_formatter, textInput.placeholder_formatter) && Intrinsics.areEqual(this.currency_formatter, textInput.currency_formatter) && this.leading_icon == textInput.leading_icon;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        State state = this.state;
        int iHashCode2 = (((((((((((((((((((((((iHashCode + (state != null ? state.hashCode() : 0)) * 37) + this.size.hashCode()) * 37) + this.placeholder_text.hashCode()) * 37) + Boolean.hashCode(this.is_disabled)) * 37) + this.label.hashCode()) * 37) + Boolean.hashCode(this.hide_label)) * 37) + this.toolbar.hashCode()) * 37) + this.keyboard_type.hashCode()) * 37) + this.autocorrection_type.hashCode()) * 37) + this.autocapitalization_type.hashCode()) * 37) + Boolean.hashCode(this.activate_keyboard_on_appear)) * 37) + this.identifier.hashCode()) * 37;
        PlaceholderFormatter placeholderFormatter = this.placeholder_formatter;
        int iHashCode3 = (iHashCode2 + (placeholderFormatter != null ? placeholderFormatter.hashCode() : 0)) * 37;
        CurrencyFormatter currencyFormatter = this.currency_formatter;
        int iHashCode4 = ((iHashCode3 + (currencyFormatter != null ? currencyFormatter.hashCode() : 0)) * 37) + this.leading_icon.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        arrayList.add("size=" + this.size);
        arrayList.add("placeholder_text=" + Internal.sanitize(this.placeholder_text));
        arrayList.add("is_disabled=" + this.is_disabled);
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("hide_label=" + this.hide_label);
        arrayList.add("toolbar=" + this.toolbar);
        arrayList.add("keyboard_type=" + this.keyboard_type);
        arrayList.add("autocorrection_type=" + this.autocorrection_type);
        arrayList.add("autocapitalization_type=" + this.autocapitalization_type);
        arrayList.add("activate_keyboard_on_appear=" + this.activate_keyboard_on_appear);
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        PlaceholderFormatter placeholderFormatter = this.placeholder_formatter;
        if (placeholderFormatter != null) {
            arrayList.add("placeholder_formatter=" + placeholderFormatter);
        }
        CurrencyFormatter currencyFormatter = this.currency_formatter;
        if (currencyFormatter != null) {
            arrayList.add("currency_formatter=" + currencyFormatter);
        }
        arrayList.add("leading_icon=" + this.leading_icon);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextInput{", "}", 0, null, null, 56, null);
    }

    public final TextInput copy(State state, Size size, String placeholder_text, boolean is_disabled, String label, boolean hide_label, Toolbar toolbar, KeyboardType keyboard_type, AutoCorrectionType autocorrection_type, AutoCapitalizationType autocapitalization_type, boolean activate_keyboard_on_appear, String identifier, PlaceholderFormatter placeholder_formatter, CurrencyFormatter currency_formatter, Icon leading_icon, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placeholder_text, "placeholder_text");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(keyboard_type, "keyboard_type");
        Intrinsics.checkNotNullParameter(autocorrection_type, "autocorrection_type");
        Intrinsics.checkNotNullParameter(autocapitalization_type, "autocapitalization_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(leading_icon, "leading_icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TextInput(state, size, placeholder_text, is_disabled, label, hide_label, toolbar, keyboard_type, autocorrection_type, autocapitalization_type, activate_keyboard_on_appear, identifier, placeholder_formatter, currency_formatter, leading_icon, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TextInput.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TextInput>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TextInput$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TextInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != null) {
                    size += TextInput.State.ADAPTER.encodedSizeWithTag(1, value.getState());
                }
                if (value.getSize() != TextInput.Size.SIZE_UNSPECIFIED) {
                    size += TextInput.Size.ADAPTER.encodedSizeWithTag(2, value.getSize());
                }
                if (!Intrinsics.areEqual(value.getPlaceholder_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPlaceholder_text());
                }
                if (value.getIs_disabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_disabled()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLabel());
                }
                if (value.getHide_label()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getHide_label()));
                }
                if (value.getToolbar() != TextInput.Toolbar.TOOLBAR_UNSPECIFIED) {
                    size += TextInput.Toolbar.ADAPTER.encodedSizeWithTag(8, value.getToolbar());
                }
                if (value.getKeyboard_type() != TextInput.KeyboardType.KEYBOARD_TYPE_UNSPECIFIED) {
                    size += TextInput.KeyboardType.ADAPTER.encodedSizeWithTag(9, value.getKeyboard_type());
                }
                if (value.getAutocorrection_type() != TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED) {
                    size += TextInput.AutoCorrectionType.ADAPTER.encodedSizeWithTag(10, value.getAutocorrection_type());
                }
                if (value.getAutocapitalization_type() != TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED) {
                    size += TextInput.AutoCapitalizationType.ADAPTER.encodedSizeWithTag(11, value.getAutocapitalization_type());
                }
                if (value.getActivate_keyboard_on_appear()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getActivate_keyboard_on_appear()));
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getIdentifier());
                }
                int iEncodedSizeWithTag = size + TextInput.PlaceholderFormatter.ADAPTER.encodedSizeWithTag(14, value.getPlaceholder_formatter()) + TextInput.CurrencyFormatter.ADAPTER.encodedSizeWithTag(15, value.getCurrency_formatter());
                return value.getLeading_icon() != Icon.ICON_UNSPECIFIED ? iEncodedSizeWithTag + Icon.ADAPTER.encodedSizeWithTag(16, value.getLeading_icon()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TextInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != null) {
                    TextInput.State.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                if (value.getSize() != TextInput.Size.SIZE_UNSPECIFIED) {
                    TextInput.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                if (!Intrinsics.areEqual(value.getPlaceholder_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPlaceholder_text());
                }
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLabel());
                }
                if (value.getHide_label()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHide_label()));
                }
                if (value.getToolbar() != TextInput.Toolbar.TOOLBAR_UNSPECIFIED) {
                    TextInput.Toolbar.ADAPTER.encodeWithTag(writer, 8, (int) value.getToolbar());
                }
                if (value.getKeyboard_type() != TextInput.KeyboardType.KEYBOARD_TYPE_UNSPECIFIED) {
                    TextInput.KeyboardType.ADAPTER.encodeWithTag(writer, 9, (int) value.getKeyboard_type());
                }
                if (value.getAutocorrection_type() != TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED) {
                    TextInput.AutoCorrectionType.ADAPTER.encodeWithTag(writer, 10, (int) value.getAutocorrection_type());
                }
                if (value.getAutocapitalization_type() != TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED) {
                    TextInput.AutoCapitalizationType.ADAPTER.encodeWithTag(writer, 11, (int) value.getAutocapitalization_type());
                }
                if (value.getActivate_keyboard_on_appear()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getActivate_keyboard_on_appear()));
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getIdentifier());
                }
                if (value.getLeading_icon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 16, (int) value.getLeading_icon());
                }
                TextInput.PlaceholderFormatter.ADAPTER.encodeWithTag(writer, 14, (int) value.getPlaceholder_formatter());
                TextInput.CurrencyFormatter.ADAPTER.encodeWithTag(writer, 15, (int) value.getCurrency_formatter());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TextInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TextInput.CurrencyFormatter.ADAPTER.encodeWithTag(writer, 15, (int) value.getCurrency_formatter());
                TextInput.PlaceholderFormatter.ADAPTER.encodeWithTag(writer, 14, (int) value.getPlaceholder_formatter());
                if (value.getLeading_icon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 16, (int) value.getLeading_icon());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getIdentifier());
                }
                if (value.getActivate_keyboard_on_appear()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getActivate_keyboard_on_appear()));
                }
                if (value.getAutocapitalization_type() != TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED) {
                    TextInput.AutoCapitalizationType.ADAPTER.encodeWithTag(writer, 11, (int) value.getAutocapitalization_type());
                }
                if (value.getAutocorrection_type() != TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED) {
                    TextInput.AutoCorrectionType.ADAPTER.encodeWithTag(writer, 10, (int) value.getAutocorrection_type());
                }
                if (value.getKeyboard_type() != TextInput.KeyboardType.KEYBOARD_TYPE_UNSPECIFIED) {
                    TextInput.KeyboardType.ADAPTER.encodeWithTag(writer, 9, (int) value.getKeyboard_type());
                }
                if (value.getToolbar() != TextInput.Toolbar.TOOLBAR_UNSPECIFIED) {
                    TextInput.Toolbar.ADAPTER.encodeWithTag(writer, 8, (int) value.getToolbar());
                }
                if (value.getHide_label()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getHide_label()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLabel());
                }
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                if (!Intrinsics.areEqual(value.getPlaceholder_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPlaceholder_text());
                }
                if (value.getSize() != TextInput.Size.SIZE_UNSPECIFIED) {
                    TextInput.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                if (value.getState() != null) {
                    TextInput.State.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextInput decode(ProtoReader reader) throws IOException {
                TextInput.Toolbar toolbar;
                TextInput.KeyboardType keyboardType;
                TextInput.AutoCorrectionType autoCorrectionType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                TextInput.Size size = TextInput.Size.SIZE_UNSPECIFIED;
                TextInput.Toolbar toolbar2 = TextInput.Toolbar.TOOLBAR_UNSPECIFIED;
                TextInput.KeyboardType keyboardType2 = TextInput.KeyboardType.KEYBOARD_TYPE_UNSPECIFIED;
                TextInput.AutoCorrectionType autoCorrectionType2 = TextInput.AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED;
                TextInput.AutoCapitalizationType autoCapitalizationType = TextInput.AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED;
                Icon icon = Icon.ICON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TextInput.Size sizeDecode = size;
                TextInput.CurrencyFormatter currencyFormatterDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                Icon iconDecode = icon;
                TextInput.State stateDecode = null;
                TextInput.PlaceholderFormatter placeholderFormatterDecode = null;
                TextInput.AutoCapitalizationType autoCapitalizationTypeDecode = autoCapitalizationType;
                TextInput.AutoCorrectionType autoCorrectionTypeDecode = autoCorrectionType2;
                TextInput.KeyboardType keyboardTypeDecode = keyboardType2;
                TextInput.Toolbar toolbarDecode = toolbar2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                stateDecode = TextInput.State.ADAPTER.decode(reader);
                                break;
                            case 2:
                                toolbar = toolbarDecode;
                                keyboardType = keyboardTypeDecode;
                                autoCorrectionType = autoCorrectionTypeDecode;
                                try {
                                    sizeDecode = TextInput.Size.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                toolbarDecode = toolbar;
                                keyboardTypeDecode = keyboardType;
                                autoCorrectionTypeDecode = autoCorrectionType;
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                            default:
                                reader.readUnknownField(iNextTag);
                                toolbar = toolbarDecode;
                                keyboardType = keyboardTypeDecode;
                                autoCorrectionType = autoCorrectionTypeDecode;
                                toolbarDecode = toolbar;
                                keyboardTypeDecode = keyboardType;
                                autoCorrectionTypeDecode = autoCorrectionType;
                                break;
                            case 8:
                                toolbar = toolbarDecode;
                                keyboardType = keyboardTypeDecode;
                                autoCorrectionType = autoCorrectionTypeDecode;
                                try {
                                    toolbarDecode = TextInput.Toolbar.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                keyboardTypeDecode = keyboardType;
                                autoCorrectionTypeDecode = autoCorrectionType;
                                break;
                            case 9:
                                toolbar = toolbarDecode;
                                keyboardType = keyboardTypeDecode;
                                autoCorrectionType = autoCorrectionTypeDecode;
                                try {
                                    keyboardTypeDecode = TextInput.KeyboardType.ADAPTER.decode(reader);
                                    toolbarDecode = toolbar;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                autoCorrectionTypeDecode = autoCorrectionType;
                                break;
                            case 10:
                                toolbar = toolbarDecode;
                                keyboardType = keyboardTypeDecode;
                                autoCorrectionType = autoCorrectionTypeDecode;
                                try {
                                    autoCorrectionTypeDecode = TextInput.AutoCorrectionType.ADAPTER.decode(reader);
                                    toolbarDecode = toolbar;
                                    keyboardTypeDecode = keyboardType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 11:
                                toolbar = toolbarDecode;
                                keyboardType = keyboardTypeDecode;
                                autoCorrectionType = autoCorrectionTypeDecode;
                                try {
                                    autoCapitalizationTypeDecode = TextInput.AutoCapitalizationType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                toolbarDecode = toolbar;
                                keyboardTypeDecode = keyboardType;
                                autoCorrectionTypeDecode = autoCorrectionType;
                                break;
                            case 12:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 13:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                placeholderFormatterDecode = TextInput.PlaceholderFormatter.ADAPTER.decode(reader);
                                break;
                            case 15:
                                currencyFormatterDecode = TextInput.CurrencyFormatter.ADAPTER.decode(reader);
                                break;
                            case 16:
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    toolbar = toolbarDecode;
                                    keyboardType = keyboardTypeDecode;
                                    autoCorrectionType = autoCorrectionTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                        }
                    } else {
                        return new TextInput(stateDecode, sizeDecode, strDecode, zBooleanValue, strDecode2, zBooleanValue2, toolbarDecode, keyboardTypeDecode, autoCorrectionTypeDecode, autoCapitalizationTypeDecode, zBooleanValue3, strDecode3, placeholderFormatterDecode, currencyFormatterDecode, iconDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextInput redact(TextInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TextInput.State state = value.getState();
                TextInput.State stateRedact = state != null ? TextInput.State.ADAPTER.redact(state) : null;
                TextInput.PlaceholderFormatter placeholder_formatter = value.getPlaceholder_formatter();
                TextInput.PlaceholderFormatter placeholderFormatterRedact = placeholder_formatter != null ? TextInput.PlaceholderFormatter.ADAPTER.redact(placeholder_formatter) : null;
                TextInput.CurrencyFormatter currency_formatter = value.getCurrency_formatter();
                return value.copy((20478 & 1) != 0 ? value.state : stateRedact, (20478 & 2) != 0 ? value.size : null, (20478 & 4) != 0 ? value.placeholder_text : null, (20478 & 8) != 0 ? value.is_disabled : false, (20478 & 16) != 0 ? value.label : null, (20478 & 32) != 0 ? value.hide_label : false, (20478 & 64) != 0 ? value.toolbar : null, (20478 & 128) != 0 ? value.keyboard_type : null, (20478 & 256) != 0 ? value.autocorrection_type : null, (20478 & 512) != 0 ? value.autocapitalization_type : null, (20478 & 1024) != 0 ? value.activate_keyboard_on_appear : false, (20478 & 2048) != 0 ? value.identifier : null, (20478 & 4096) != 0 ? value.placeholder_formatter : placeholderFormatterRedact, (20478 & 8192) != 0 ? value.currency_formatter : currency_formatter != null ? TextInput.CurrencyFormatter.ADAPTER.redact(currency_formatter) : null, (20478 & 16384) != 0 ? value.leading_icon : null, (20478 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$State;", "Lcom/squareup/wire/Message;", "", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State extends Message {

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29837newBuilder();
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ State(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public State(String text, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.text = text;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29837newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(unknownFields(), state.unknownFields()) && Intrinsics.areEqual(this.text, state.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.text.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("text=" + Internal.sanitize(this.text));
            return CollectionsKt.joinToString$default(arrayList, ", ", "State{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ State copy$default(State state, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = state.text;
            }
            if ((i & 2) != 0) {
                byteString = state.unknownFields();
            }
            return state.copy(str, byteString);
        }

        public final State copy(String text, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new State(text, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<State>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TextInput$State$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TextInput.State decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new TextInput.State(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TextInput.State value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getText(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TextInput.State value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TextInput.State value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getText(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TextInput.State redact(TextInput.State value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return TextInput.State.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$PlaceholderFormatter;", "Lcom/squareup/wire/Message;", "", "max_length", "", "format", "", "placeholder_character", "valid_characters", "Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextInput$ValidCharacters;Lokio/ByteString;)V", "getMax_length", "()I", "getFormat", "()Ljava/lang/String;", "getPlaceholder_character", "getValid_characters", "()Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class PlaceholderFormatter extends Message {

        @JvmField
        public static final ProtoAdapter<PlaceholderFormatter> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String format;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxLength", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final int max_length;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "placeholderCharacter", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String placeholder_character;

        @WireField(adapter = "rh_server_driven_ui.v1.TextInput$ValidCharacters#ADAPTER", jsonName = "validCharacters", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final ValidCharacters valid_characters;

        public PlaceholderFormatter() {
            this(0, null, null, null, null, 31, null);
        }

        public /* synthetic */ PlaceholderFormatter(int i, String str, String str2, ValidCharacters validCharacters, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? ValidCharacters.VALID_CHARACTERS_UNSPECIFIED : validCharacters, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29836newBuilder();
        }

        public final int getMax_length() {
            return this.max_length;
        }

        public final String getFormat() {
            return this.format;
        }

        public final String getPlaceholder_character() {
            return this.placeholder_character;
        }

        public final ValidCharacters getValid_characters() {
            return this.valid_characters;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaceholderFormatter(int i, String format2, String placeholder_character, ValidCharacters valid_characters, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(placeholder_character, "placeholder_character");
            Intrinsics.checkNotNullParameter(valid_characters, "valid_characters");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.max_length = i;
            this.format = format2;
            this.placeholder_character = placeholder_character;
            this.valid_characters = valid_characters;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29836newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PlaceholderFormatter)) {
                return false;
            }
            PlaceholderFormatter placeholderFormatter = (PlaceholderFormatter) other;
            return Intrinsics.areEqual(unknownFields(), placeholderFormatter.unknownFields()) && this.max_length == placeholderFormatter.max_length && Intrinsics.areEqual(this.format, placeholderFormatter.format) && Intrinsics.areEqual(this.placeholder_character, placeholderFormatter.placeholder_character) && this.valid_characters == placeholderFormatter.valid_characters;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.max_length)) * 37) + this.format.hashCode()) * 37) + this.placeholder_character.hashCode()) * 37) + this.valid_characters.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("max_length=" + this.max_length);
            arrayList.add("format=" + Internal.sanitize(this.format));
            arrayList.add("placeholder_character=" + Internal.sanitize(this.placeholder_character));
            arrayList.add("valid_characters=" + this.valid_characters);
            return CollectionsKt.joinToString$default(arrayList, ", ", "PlaceholderFormatter{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PlaceholderFormatter copy$default(PlaceholderFormatter placeholderFormatter, int i, String str, String str2, ValidCharacters validCharacters, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = placeholderFormatter.max_length;
            }
            if ((i2 & 2) != 0) {
                str = placeholderFormatter.format;
            }
            if ((i2 & 4) != 0) {
                str2 = placeholderFormatter.placeholder_character;
            }
            if ((i2 & 8) != 0) {
                validCharacters = placeholderFormatter.valid_characters;
            }
            if ((i2 & 16) != 0) {
                byteString = placeholderFormatter.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str3 = str2;
            return placeholderFormatter.copy(i, str, str3, validCharacters, byteString2);
        }

        public final PlaceholderFormatter copy(int max_length, String format2, String placeholder_character, ValidCharacters valid_characters, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(placeholder_character, "placeholder_character");
            Intrinsics.checkNotNullParameter(valid_characters, "valid_characters");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PlaceholderFormatter(max_length, format2, placeholder_character, valid_characters, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaceholderFormatter.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PlaceholderFormatter>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TextInput$PlaceholderFormatter$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TextInput.PlaceholderFormatter value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getMax_length() != 0) {
                        size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getMax_length()));
                    }
                    if (!Intrinsics.areEqual(value.getFormat(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFormat());
                    }
                    if (!Intrinsics.areEqual(value.getPlaceholder_character(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPlaceholder_character());
                    }
                    return value.getValid_characters() != TextInput.ValidCharacters.VALID_CHARACTERS_UNSPECIFIED ? size + TextInput.ValidCharacters.ADAPTER.encodedSizeWithTag(4, value.getValid_characters()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TextInput.PlaceholderFormatter value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getMax_length() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getMax_length()));
                    }
                    if (!Intrinsics.areEqual(value.getFormat(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFormat());
                    }
                    if (!Intrinsics.areEqual(value.getPlaceholder_character(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPlaceholder_character());
                    }
                    if (value.getValid_characters() != TextInput.ValidCharacters.VALID_CHARACTERS_UNSPECIFIED) {
                        TextInput.ValidCharacters.ADAPTER.encodeWithTag(writer, 4, (int) value.getValid_characters());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TextInput.PlaceholderFormatter value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getValid_characters() != TextInput.ValidCharacters.VALID_CHARACTERS_UNSPECIFIED) {
                        TextInput.ValidCharacters.ADAPTER.encodeWithTag(writer, 4, (int) value.getValid_characters());
                    }
                    if (!Intrinsics.areEqual(value.getPlaceholder_character(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPlaceholder_character());
                    }
                    if (!Intrinsics.areEqual(value.getFormat(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFormat());
                    }
                    if (value.getMax_length() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getMax_length()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TextInput.PlaceholderFormatter decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    TextInput.ValidCharacters validCharactersDecode = TextInput.ValidCharacters.VALID_CHARACTERS_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    int iIntValue = 0;
                    String strDecode2 = "";
                    while (true) {
                        TextInput.ValidCharacters validCharacters = validCharactersDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new TextInput.PlaceholderFormatter(iIntValue, strDecode, strDecode2, validCharacters, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 2) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 4) {
                                try {
                                    validCharactersDecode = TextInput.ValidCharacters.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TextInput.PlaceholderFormatter redact(TextInput.PlaceholderFormatter value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return TextInput.PlaceholderFormatter.copy$default(value, 0, null, null, null, ByteString.EMPTY, 15, null);
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VALID_CHARACTERS_UNSPECIFIED", "VALID_CHARACTERS_ALPHANUMERIC", "VALID_CHARACTERS_NUMERIC", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class ValidCharacters implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ValidCharacters[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ValidCharacters> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ValidCharacters VALID_CHARACTERS_ALPHANUMERIC;
        public static final ValidCharacters VALID_CHARACTERS_NUMERIC;
        public static final ValidCharacters VALID_CHARACTERS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ ValidCharacters[] $values() {
            return new ValidCharacters[]{VALID_CHARACTERS_UNSPECIFIED, VALID_CHARACTERS_ALPHANUMERIC, VALID_CHARACTERS_NUMERIC};
        }

        @JvmStatic
        public static final ValidCharacters fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ValidCharacters> getEntries() {
            return $ENTRIES;
        }

        private ValidCharacters(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ValidCharacters validCharacters = new ValidCharacters("VALID_CHARACTERS_UNSPECIFIED", 0, 0);
            VALID_CHARACTERS_UNSPECIFIED = validCharacters;
            VALID_CHARACTERS_ALPHANUMERIC = new ValidCharacters("VALID_CHARACTERS_ALPHANUMERIC", 1, 1);
            VALID_CHARACTERS_NUMERIC = new ValidCharacters("VALID_CHARACTERS_NUMERIC", 2, 2);
            ValidCharacters[] validCharactersArr$values = $values();
            $VALUES = validCharactersArr$values;
            $ENTRIES = EnumEntries2.enumEntries(validCharactersArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidCharacters.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ValidCharacters>(orCreateKotlinClass, syntax, validCharacters) { // from class: rh_server_driven_ui.v1.TextInput$ValidCharacters$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextInput.ValidCharacters fromValue(int value) {
                    return TextInput.ValidCharacters.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextInput.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$ValidCharacters$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextInput$ValidCharacters;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ValidCharacters fromValue(int value) {
                if (value == 0) {
                    return ValidCharacters.VALID_CHARACTERS_UNSPECIFIED;
                }
                if (value == 1) {
                    return ValidCharacters.VALID_CHARACTERS_ALPHANUMERIC;
                }
                if (value != 2) {
                    return null;
                }
                return ValidCharacters.VALID_CHARACTERS_NUMERIC;
            }
        }

        public static ValidCharacters valueOf(String str) {
            return (ValidCharacters) Enum.valueOf(ValidCharacters.class, str);
        }

        public static ValidCharacters[] values() {
            return (ValidCharacters[]) $VALUES.clone();
        }
    }

    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$CurrencyFormatter;", "Lcom/squareup/wire/Message;", "", "currency_code", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_code", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class CurrencyFormatter extends Message {

        @JvmField
        public static final ProtoAdapter<CurrencyFormatter> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String currency_code;

        /* JADX WARN: Multi-variable type inference failed */
        public CurrencyFormatter() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29835newBuilder();
        }

        public final String getCurrency_code() {
            return this.currency_code;
        }

        public /* synthetic */ CurrencyFormatter(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyFormatter(String currency_code, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.currency_code = currency_code;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29835newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CurrencyFormatter)) {
                return false;
            }
            CurrencyFormatter currencyFormatter = (CurrencyFormatter) other;
            return Intrinsics.areEqual(unknownFields(), currencyFormatter.unknownFields()) && Intrinsics.areEqual(this.currency_code, currencyFormatter.currency_code);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.currency_code.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("currency_code=" + Internal.sanitize(this.currency_code));
            return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyFormatter{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CurrencyFormatter copy$default(CurrencyFormatter currencyFormatter, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencyFormatter.currency_code;
            }
            if ((i & 2) != 0) {
                byteString = currencyFormatter.unknownFields();
            }
            return currencyFormatter.copy(str, byteString);
        }

        public final CurrencyFormatter copy(String currency_code, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CurrencyFormatter(currency_code, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyFormatter.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CurrencyFormatter>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TextInput$CurrencyFormatter$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TextInput.CurrencyFormatter decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new TextInput.CurrencyFormatter(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TextInput.CurrencyFormatter value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getCurrency_code(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_code()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TextInput.CurrencyFormatter value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_code());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TextInput.CurrencyFormatter value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getCurrency_code(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_code());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TextInput.CurrencyFormatter redact(TextInput.CurrencyFormatter value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return TextInput.CurrencyFormatter.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$Toolbar;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TOOLBAR_UNSPECIFIED", "TOOLBAR_DEFAULT", "TOOLBAR_NONE", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Toolbar implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Toolbar[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Toolbar> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Toolbar TOOLBAR_DEFAULT;
        public static final Toolbar TOOLBAR_NONE;
        public static final Toolbar TOOLBAR_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Toolbar[] $values() {
            return new Toolbar[]{TOOLBAR_UNSPECIFIED, TOOLBAR_DEFAULT, TOOLBAR_NONE};
        }

        @JvmStatic
        public static final Toolbar fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Toolbar> getEntries() {
            return $ENTRIES;
        }

        private Toolbar(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Toolbar toolbar = new Toolbar("TOOLBAR_UNSPECIFIED", 0, 0);
            TOOLBAR_UNSPECIFIED = toolbar;
            TOOLBAR_DEFAULT = new Toolbar("TOOLBAR_DEFAULT", 1, 1);
            TOOLBAR_NONE = new Toolbar("TOOLBAR_NONE", 2, 2);
            Toolbar[] toolbarArr$values = $values();
            $VALUES = toolbarArr$values;
            $ENTRIES = EnumEntries2.enumEntries(toolbarArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Toolbar.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Toolbar>(orCreateKotlinClass, syntax, toolbar) { // from class: rh_server_driven_ui.v1.TextInput$Toolbar$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextInput.Toolbar fromValue(int value) {
                    return TextInput.Toolbar.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextInput.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$Toolbar$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextInput$Toolbar;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Toolbar fromValue(int value) {
                if (value == 0) {
                    return Toolbar.TOOLBAR_UNSPECIFIED;
                }
                if (value == 1) {
                    return Toolbar.TOOLBAR_DEFAULT;
                }
                if (value != 2) {
                    return null;
                }
                return Toolbar.TOOLBAR_NONE;
            }
        }

        public static Toolbar valueOf(String str) {
            return (Toolbar) Enum.valueOf(Toolbar.class, str);
        }

        public static Toolbar[] values() {
            return (Toolbar[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$Size;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIZE_UNSPECIFIED", "SIZE_HERO", "SIZE_REGULAR", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Size implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Size> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Size SIZE_HERO;
        public static final Size SIZE_REGULAR;
        public static final Size SIZE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_UNSPECIFIED, SIZE_HERO, SIZE_REGULAR};
        }

        @JvmStatic
        public static final Size fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Size> getEntries() {
            return $ENTRIES;
        }

        private Size(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Size size = new Size("SIZE_UNSPECIFIED", 0, 0);
            SIZE_UNSPECIFIED = size;
            SIZE_HERO = new Size("SIZE_HERO", 1, 1);
            SIZE_REGULAR = new Size("SIZE_REGULAR", 2, 2);
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Size.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Size>(orCreateKotlinClass, syntax, size) { // from class: rh_server_driven_ui.v1.TextInput$Size$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextInput.Size fromValue(int value) {
                    return TextInput.Size.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextInput.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$Size$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextInput$Size;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Size fromValue(int value) {
                if (value == 0) {
                    return Size.SIZE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Size.SIZE_HERO;
                }
                if (value != 2) {
                    return null;
                }
                return Size.SIZE_REGULAR;
            }
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "KEYBOARD_TYPE_UNSPECIFIED", "KEYBOARD_TYPE_NATIVE", "KEYBOARD_TYPE_EMAIL", "KEYBOARD_TYPE_DECIMAL", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class KeyboardType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ KeyboardType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<KeyboardType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final KeyboardType KEYBOARD_TYPE_DECIMAL;
        public static final KeyboardType KEYBOARD_TYPE_EMAIL;
        public static final KeyboardType KEYBOARD_TYPE_NATIVE;
        public static final KeyboardType KEYBOARD_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ KeyboardType[] $values() {
            return new KeyboardType[]{KEYBOARD_TYPE_UNSPECIFIED, KEYBOARD_TYPE_NATIVE, KEYBOARD_TYPE_EMAIL, KEYBOARD_TYPE_DECIMAL};
        }

        @JvmStatic
        public static final KeyboardType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<KeyboardType> getEntries() {
            return $ENTRIES;
        }

        private KeyboardType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final KeyboardType keyboardType = new KeyboardType("KEYBOARD_TYPE_UNSPECIFIED", 0, 0);
            KEYBOARD_TYPE_UNSPECIFIED = keyboardType;
            KEYBOARD_TYPE_NATIVE = new KeyboardType("KEYBOARD_TYPE_NATIVE", 1, 1);
            KEYBOARD_TYPE_EMAIL = new KeyboardType("KEYBOARD_TYPE_EMAIL", 2, 2);
            KEYBOARD_TYPE_DECIMAL = new KeyboardType("KEYBOARD_TYPE_DECIMAL", 3, 3);
            KeyboardType[] keyboardTypeArr$values = $values();
            $VALUES = keyboardTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(keyboardTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KeyboardType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<KeyboardType>(orCreateKotlinClass, syntax, keyboardType) { // from class: rh_server_driven_ui.v1.TextInput$KeyboardType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextInput.KeyboardType fromValue(int value) {
                    return TextInput.KeyboardType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextInput.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$KeyboardType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextInput$KeyboardType;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final KeyboardType fromValue(int value) {
                if (value == 0) {
                    return KeyboardType.KEYBOARD_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return KeyboardType.KEYBOARD_TYPE_NATIVE;
                }
                if (value == 2) {
                    return KeyboardType.KEYBOARD_TYPE_EMAIL;
                }
                if (value != 3) {
                    return null;
                }
                return KeyboardType.KEYBOARD_TYPE_DECIMAL;
            }
        }

        public static KeyboardType valueOf(String str) {
            return (KeyboardType) Enum.valueOf(KeyboardType.class, str);
        }

        public static KeyboardType[] values() {
            return (KeyboardType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AUTO_CORRECTION_TYPE_UNSPECIFIED", "AUTO_CORRECTION_TYPE_DEFAULT", "AUTO_CORRECTION_TYPE_NO", "AUTO_CORRECTION_TYPE_YES", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class AutoCorrectionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AutoCorrectionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AutoCorrectionType> ADAPTER;
        public static final AutoCorrectionType AUTO_CORRECTION_TYPE_DEFAULT;
        public static final AutoCorrectionType AUTO_CORRECTION_TYPE_NO;
        public static final AutoCorrectionType AUTO_CORRECTION_TYPE_UNSPECIFIED;
        public static final AutoCorrectionType AUTO_CORRECTION_TYPE_YES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ AutoCorrectionType[] $values() {
            return new AutoCorrectionType[]{AUTO_CORRECTION_TYPE_UNSPECIFIED, AUTO_CORRECTION_TYPE_DEFAULT, AUTO_CORRECTION_TYPE_NO, AUTO_CORRECTION_TYPE_YES};
        }

        @JvmStatic
        public static final AutoCorrectionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AutoCorrectionType> getEntries() {
            return $ENTRIES;
        }

        private AutoCorrectionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AutoCorrectionType autoCorrectionType = new AutoCorrectionType("AUTO_CORRECTION_TYPE_UNSPECIFIED", 0, 0);
            AUTO_CORRECTION_TYPE_UNSPECIFIED = autoCorrectionType;
            AUTO_CORRECTION_TYPE_DEFAULT = new AutoCorrectionType("AUTO_CORRECTION_TYPE_DEFAULT", 1, 1);
            AUTO_CORRECTION_TYPE_NO = new AutoCorrectionType("AUTO_CORRECTION_TYPE_NO", 2, 2);
            AUTO_CORRECTION_TYPE_YES = new AutoCorrectionType("AUTO_CORRECTION_TYPE_YES", 3, 3);
            AutoCorrectionType[] autoCorrectionTypeArr$values = $values();
            $VALUES = autoCorrectionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(autoCorrectionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AutoCorrectionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AutoCorrectionType>(orCreateKotlinClass, syntax, autoCorrectionType) { // from class: rh_server_driven_ui.v1.TextInput$AutoCorrectionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextInput.AutoCorrectionType fromValue(int value) {
                    return TextInput.AutoCorrectionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextInput.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextInput$AutoCorrectionType;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AutoCorrectionType fromValue(int value) {
                if (value == 0) {
                    return AutoCorrectionType.AUTO_CORRECTION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AutoCorrectionType.AUTO_CORRECTION_TYPE_DEFAULT;
                }
                if (value == 2) {
                    return AutoCorrectionType.AUTO_CORRECTION_TYPE_NO;
                }
                if (value != 3) {
                    return null;
                }
                return AutoCorrectionType.AUTO_CORRECTION_TYPE_YES;
            }
        }

        public static AutoCorrectionType valueOf(String str) {
            return (AutoCorrectionType) Enum.valueOf(AutoCorrectionType.class, str);
        }

        public static AutoCorrectionType[] values() {
            return (AutoCorrectionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInput.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AUTO_CAPITALIZATION_TYPE_UNSPECIFIED", "AUTO_CAPITALIZATION_TYPE_NONE", "AUTO_CAPITALIZATION_TYPE_WORDS", "AUTO_CAPITALIZATION_TYPE_SENTENCES", "AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class AutoCapitalizationType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AutoCapitalizationType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AutoCapitalizationType> ADAPTER;
        public static final AutoCapitalizationType AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS;
        public static final AutoCapitalizationType AUTO_CAPITALIZATION_TYPE_NONE;
        public static final AutoCapitalizationType AUTO_CAPITALIZATION_TYPE_SENTENCES;
        public static final AutoCapitalizationType AUTO_CAPITALIZATION_TYPE_UNSPECIFIED;
        public static final AutoCapitalizationType AUTO_CAPITALIZATION_TYPE_WORDS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ AutoCapitalizationType[] $values() {
            return new AutoCapitalizationType[]{AUTO_CAPITALIZATION_TYPE_UNSPECIFIED, AUTO_CAPITALIZATION_TYPE_NONE, AUTO_CAPITALIZATION_TYPE_WORDS, AUTO_CAPITALIZATION_TYPE_SENTENCES, AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS};
        }

        @JvmStatic
        public static final AutoCapitalizationType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AutoCapitalizationType> getEntries() {
            return $ENTRIES;
        }

        private AutoCapitalizationType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AutoCapitalizationType autoCapitalizationType = new AutoCapitalizationType("AUTO_CAPITALIZATION_TYPE_UNSPECIFIED", 0, 0);
            AUTO_CAPITALIZATION_TYPE_UNSPECIFIED = autoCapitalizationType;
            AUTO_CAPITALIZATION_TYPE_NONE = new AutoCapitalizationType("AUTO_CAPITALIZATION_TYPE_NONE", 1, 1);
            AUTO_CAPITALIZATION_TYPE_WORDS = new AutoCapitalizationType("AUTO_CAPITALIZATION_TYPE_WORDS", 2, 2);
            AUTO_CAPITALIZATION_TYPE_SENTENCES = new AutoCapitalizationType("AUTO_CAPITALIZATION_TYPE_SENTENCES", 3, 3);
            AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS = new AutoCapitalizationType("AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS", 4, 4);
            AutoCapitalizationType[] autoCapitalizationTypeArr$values = $values();
            $VALUES = autoCapitalizationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(autoCapitalizationTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AutoCapitalizationType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AutoCapitalizationType>(orCreateKotlinClass, syntax, autoCapitalizationType) { // from class: rh_server_driven_ui.v1.TextInput$AutoCapitalizationType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextInput.AutoCapitalizationType fromValue(int value) {
                    return TextInput.AutoCapitalizationType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextInput.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextInput$AutoCapitalizationType;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AutoCapitalizationType fromValue(int value) {
                if (value == 0) {
                    return AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_NONE;
                }
                if (value == 2) {
                    return AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_WORDS;
                }
                if (value == 3) {
                    return AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_SENTENCES;
                }
                if (value != 4) {
                    return null;
                }
                return AutoCapitalizationType.AUTO_CAPITALIZATION_TYPE_ALL_CHARACTERS;
            }
        }

        public static AutoCapitalizationType valueOf(String str) {
            return (AutoCapitalizationType) Enum.valueOf(AutoCapitalizationType.class, str);
        }

        public static AutoCapitalizationType[] values() {
            return (AutoCapitalizationType[]) $VALUES.clone();
        }
    }
}
