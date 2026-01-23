package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format;

import android.net.Uri;
import com.salesforce.android.smi.common.internal.util.URLUtils;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations.CitationContent;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.titleItem.TitleItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.richLink.LinkItem;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.webView.SurveyParameter;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.salesforce.android.smi.network.data.domain.webview.MutableTemplatedWebView;
import com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StaticContentFormat.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "StaticContentFormatType", "TextFormat", "RichLinkFormat", "AttachmentsFormat", "WebViewFormat", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$AttachmentsFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$RichLinkFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$TextFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$WebViewFormat;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface StaticContentFormat extends MessageFormat {
    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
    StaticContentFormatType getFormatType();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StaticContentFormat.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType;", "", "<init>", "(Ljava/lang/String;I)V", "Text", "Attachments", "RichLink", "WebView", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class StaticContentFormatType implements MessageFormat.FormatType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StaticContentFormatType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final StaticContentFormatType Text = new StaticContentFormatType("Text", 0);
        public static final StaticContentFormatType Attachments = new StaticContentFormatType("Attachments", 1);
        public static final StaticContentFormatType RichLink = new StaticContentFormatType("RichLink", 2);
        public static final StaticContentFormatType WebView = new StaticContentFormatType("WebView", 3);

        private static final /* synthetic */ StaticContentFormatType[] $values() {
            return new StaticContentFormatType[]{Text, Attachments, RichLink, WebView};
        }

        public static EnumEntries<StaticContentFormatType> getEntries() {
            return $ENTRIES;
        }

        private StaticContentFormatType(String str, int i) {
        }

        static {
            StaticContentFormatType[] staticContentFormatTypeArr$values = $values();
            $VALUES = staticContentFormatTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(staticContentFormatTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: StaticContentFormat.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType$Companion;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/MessageFormat$FormatType$EnumValueTypeHelper;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "<init>", "()V", "enumValueOfOrNull", "name", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements MessageFormat.FormatType.EnumValueTypeHelper<StaticContentFormatType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat.FormatType.EnumValueTypeHelper
            public StaticContentFormatType enumValueOfOrNull(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                for (StaticContentFormatType staticContentFormatType : StaticContentFormatType.values()) {
                    if (Intrinsics.areEqual(staticContentFormatType.name(), name)) {
                        return staticContentFormatType;
                    }
                }
                return null;
            }
        }

        public static StaticContentFormatType valueOf(String str) {
            return (StaticContentFormatType) Enum.valueOf(StaticContentFormatType.class, str);
        }

        public static StaticContentFormatType[] values() {
            return (StaticContentFormatType[]) $VALUES.clone();
        }
    }

    /* compiled from: StaticContentFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$TextFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "text", "", "citationContent", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationContent;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationContent;)V", "getText", "()Ljava/lang/String;", "getCitationContent", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationContent;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static class TextFormat implements StaticContentFormat {
        private final CitationContent citationContent;
        private final StaticContentFormatType formatType;
        private final String text;

        public TextFormat(String text, CitationContent citationContent) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.citationContent = citationContent;
            this.formatType = StaticContentFormatType.Text;
        }

        public /* synthetic */ TextFormat(String str, CitationContent citationContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : citationContent);
        }

        public final String getText() {
            return this.text;
        }

        public final CitationContent getCitationContent() {
            return this.citationContent;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public StaticContentFormatType getFormatType() {
            return this.formatType;
        }
    }

    /* compiled from: StaticContentFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$RichLinkFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "image", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$RichLinkImage;", "linkItem", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/richLink/LinkItem;", "text", "", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$RichLinkImage;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/richLink/LinkItem;Ljava/lang/String;)V", "getImage", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$RichLinkImage;", "getLinkItem", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/richLink/LinkItem;", "getText", "()Ljava/lang/String;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class RichLinkFormat implements StaticContentFormat {
        private final StaticContentFormatType formatType;
        private final FileAsset.ImageAsset.RichLinkImage image;
        private final LinkItem linkItem;
        private final String text;

        public RichLinkFormat(FileAsset.ImageAsset.RichLinkImage richLinkImage, LinkItem linkItem, String str) {
            Intrinsics.checkNotNullParameter(linkItem, "linkItem");
            this.image = richLinkImage;
            this.linkItem = linkItem;
            this.text = str;
            this.formatType = StaticContentFormatType.RichLink;
        }

        public /* synthetic */ RichLinkFormat(FileAsset.ImageAsset.RichLinkImage richLinkImage, LinkItem linkItem, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : richLinkImage, linkItem, str);
        }

        public final FileAsset.ImageAsset.RichLinkImage getImage() {
            return this.image;
        }

        public final LinkItem getLinkItem() {
            return this.linkItem;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public StaticContentFormatType getFormatType() {
            return this.formatType;
        }
    }

    /* compiled from: StaticContentFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$AttachmentsFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "text", "", "attachments", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getAttachments", "()Ljava/util/List;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class AttachmentsFormat implements StaticContentFormat {
        private final List<FileAsset> attachments;
        private final StaticContentFormatType formatType;
        private final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public AttachmentsFormat(String str, List<? extends FileAsset> attachments) {
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            this.text = str;
            this.attachments = attachments;
            this.formatType = StaticContentFormatType.Attachments;
        }

        public final String getText() {
            return this.text;
        }

        public final List<FileAsset> getAttachments() {
            return this.attachments;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public StaticContentFormatType getFormatType() {
            return this.formatType;
        }
    }

    /* compiled from: StaticContentFormat.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010!8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$WebViewFormat;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat;", "baseUrl", "", "title", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "parameters", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/webView/SurveyParameter;", "persistedUri", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;Ljava/util/List;Landroid/net/Uri;)V", "getBaseUrl", "()Ljava/lang/String;", "getTitle", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/titleItem/TitleItem;", "getParameters", "()Ljava/util/List;", "getPersistedUri", "()Landroid/net/Uri;", "templatedWebView", "Lcom/salesforce/android/smi/network/data/domain/webview/TemplatedWebView;", "getTemplatedWebView", "()Lcom/salesforce/android/smi/network/data/domain/webview/TemplatedWebView;", "formattedUri", "getFormattedUri$annotations", "()V", "getFormattedUri", "url", "getUrl$annotations", "getUrl", "persistedUrl", "Ljava/net/URL;", "getPersistedUrl$annotations", "getPersistedUrl", "()Ljava/net/URL;", "formatType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "getFormatType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$StaticContentFormatType;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class WebViewFormat implements StaticContentFormat {
        private final String baseUrl;
        private final StaticContentFormatType formatType;
        private final List<SurveyParameter> parameters;
        private final transient Uri persistedUri;
        private final transient TemplatedWebView templatedWebView;
        private final TitleItem title;

        @Json(ignore = true)
        public static /* synthetic */ void getFormattedUri$annotations() {
        }

        @Json(ignore = true)
        public static /* synthetic */ void getPersistedUrl$annotations() {
        }

        @Json(ignore = true)
        public static /* synthetic */ void getUrl$annotations() {
        }

        public WebViewFormat(@Json(name = "url") String baseUrl, TitleItem title, List<SurveyParameter> list, Uri uri) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            this.baseUrl = baseUrl;
            this.title = title;
            this.parameters = list;
            this.persistedUri = uri;
            this.templatedWebView = new MutableTemplatedWebView(this);
            this.formatType = StaticContentFormatType.WebView;
        }

        public /* synthetic */ WebViewFormat(String str, TitleItem titleItem, List list, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, titleItem, list, (i & 8) != 0 ? null : uri);
        }

        public final String getBaseUrl() {
            return this.baseUrl;
        }

        public final TitleItem getTitle() {
            return this.title;
        }

        public final List<SurveyParameter> getParameters() {
            return this.parameters;
        }

        public final Uri getPersistedUri() {
            return this.persistedUri;
        }

        public final TemplatedWebView getTemplatedWebView() {
            return this.templatedWebView;
        }

        public final Uri getFormattedUri() {
            return this.templatedWebView.getFormattedUri();
        }

        public final String getUrl() {
            String string2;
            URL url = this.templatedWebView.getUrl();
            return (url == null || (string2 = url.toString()) == null) ? this.baseUrl : string2;
        }

        public final URL getPersistedUrl() {
            Uri uri = this.persistedUri;
            if (uri != null) {
                return URLUtils.INSTANCE.getToUrlOrNull(uri);
            }
            return null;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat
        public StaticContentFormatType getFormatType() {
            return this.formatType;
        }
    }
}
