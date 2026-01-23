package com.twilio.conversations.extensions;

import com.robinhood.android.car.result.CarResultComposable2;
import com.twilio.conversations.Attributes;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.MediaUploadListener;
import com.twilio.conversations.MediaUploadListener2;
import com.twilio.conversations.content.ContentTemplateVariable;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationsExtensions.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&JC\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\u0019\b\u0002\u0010'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020 0(¢\u0006\u0002\b*H\u0086\bø\u0001\u0000J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007J\u0016\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007J\"\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J7\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0019\b\u0002\u0010'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020 0(¢\u0006\u0002\b*H\u0086\bø\u0001\u0000J\u0016\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007J\u0016\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007J\"\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J7\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0019\b\u0002\u0010'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020 0(¢\u0006\u0002\b*H\u0086\bø\u0001\u0000J\u0016\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007J\b\u0010/\u001a\u000200H\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, m3636d2 = {"Lcom/twilio/conversations/extensions/MessageBuilder;", "", "builder", "Lcom/twilio/conversations/Conversation$MessageBuilder;", "<init>", "(Lcom/twilio/conversations/Conversation$MessageBuilder;)V", CarResultComposable2.BODY, "", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "subject", "getSubject", "setSubject", "attributes", "Lcom/twilio/conversations/Attributes;", "getAttributes", "()Lcom/twilio/conversations/Attributes;", "setAttributes", "(Lcom/twilio/conversations/Attributes;)V", "contentTemplateSid", "getContentTemplateSid", "setContentTemplateSid", "contentTemplateVariables", "", "Lcom/twilio/conversations/content/ContentTemplateVariable;", "getContentTemplateVariables", "()Ljava/util/List;", "setContentTemplateVariables", "(Ljava/util/List;)V", "addMedia", "", "inputStream", "Ljava/io/InputStream;", "contentType", "filename", "listener", "Lcom/twilio/conversations/MediaUploadListener;", "block", "Lkotlin/Function1;", "Lcom/twilio/conversations/MediaUploadListenerBuilder;", "Lkotlin/ExtensionFunctionType;", "setEmailBody", "emailBody", "setEmailHistory", "emailHistory", "build", "Lcom/twilio/conversations/Conversation$UnsentMessage;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MessageBuilder {
    private Attributes attributes;
    private String body;
    private final Conversation.MessageBuilder builder;
    private String contentTemplateSid;
    private List<ContentTemplateVariable> contentTemplateVariables;
    private String subject;

    public MessageBuilder(Conversation.MessageBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        Attributes DEFAULT = Attributes.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.attributes = DEFAULT;
    }

    public final String getBody() {
        return this.body;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final void setSubject(String str) {
        this.subject = str;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final void setAttributes(Attributes attributes) {
        Intrinsics.checkNotNullParameter(attributes, "<set-?>");
        this.attributes = attributes;
    }

    public final String getContentTemplateSid() {
        return this.contentTemplateSid;
    }

    public final void setContentTemplateSid(String str) {
        this.contentTemplateSid = str;
    }

    public final List<ContentTemplateVariable> getContentTemplateVariables() {
        return this.contentTemplateVariables;
    }

    public final void setContentTemplateVariables(List<ContentTemplateVariable> list) {
        this.contentTemplateVariables = list;
    }

    public static /* synthetic */ void addMedia$default(MessageBuilder messageBuilder, InputStream inputStream, String str, String str2, MediaUploadListener mediaUploadListener, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            mediaUploadListener = null;
        }
        messageBuilder.addMedia(inputStream, str, str2, mediaUploadListener);
    }

    public final void addMedia(InputStream inputStream, String contentType, String filename, MediaUploadListener listener) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.builder.addMedia(inputStream, contentType, filename, listener);
    }

    public static /* synthetic */ void addMedia$default(MessageBuilder messageBuilder, InputStream inputStream, String contentType, String str, Function1 block, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            block = new Function1<MediaUploadListener2, Unit>() { // from class: com.twilio.conversations.extensions.MessageBuilder.addMedia.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MediaUploadListener2 mediaUploadListener2) {
                    Intrinsics.checkNotNullParameter(mediaUploadListener2, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediaUploadListener2 mediaUploadListener2) {
                    invoke2(mediaUploadListener2);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(block, "block");
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        block.invoke(mediaUploadListener2);
        messageBuilder.addMedia(inputStream, contentType, str, mediaUploadListener2.build());
    }

    public final void addMedia(InputStream inputStream, String contentType, String filename, Function1<? super MediaUploadListener2, Unit> block) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(block, "block");
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        block.invoke(mediaUploadListener2);
        addMedia(inputStream, contentType, filename, mediaUploadListener2.build());
    }

    public static /* synthetic */ void addMedia$default(MessageBuilder messageBuilder, InputStream inputStream, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        messageBuilder.addMedia(inputStream, str, str2);
    }

    public final void addMedia(InputStream inputStream, String contentType, String filename) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        addMedia(inputStream, contentType, filename, (MediaUploadListener) null);
    }

    public final void setEmailBody(String emailBody, String contentType) {
        Intrinsics.checkNotNullParameter(emailBody, "emailBody");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.builder.setEmailBody(emailBody, contentType);
    }

    public static /* synthetic */ void setEmailBody$default(MessageBuilder messageBuilder, InputStream inputStream, String str, MediaUploadListener mediaUploadListener, int i, Object obj) {
        if ((i & 4) != 0) {
            mediaUploadListener = null;
        }
        messageBuilder.setEmailBody(inputStream, str, mediaUploadListener);
    }

    public final void setEmailBody(InputStream inputStream, String contentType, MediaUploadListener listener) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.builder.setEmailBody(inputStream, contentType, listener);
    }

    public static /* synthetic */ void setEmailBody$default(MessageBuilder messageBuilder, InputStream inputStream, String contentType, Function1 block, int i, Object obj) {
        if ((i & 4) != 0) {
            block = new Function1<MediaUploadListener2, Unit>() { // from class: com.twilio.conversations.extensions.MessageBuilder.setEmailBody.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MediaUploadListener2 mediaUploadListener2) {
                    Intrinsics.checkNotNullParameter(mediaUploadListener2, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediaUploadListener2 mediaUploadListener2) {
                    invoke2(mediaUploadListener2);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(block, "block");
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        block.invoke(mediaUploadListener2);
        messageBuilder.setEmailBody(inputStream, contentType, mediaUploadListener2.build());
    }

    public final void setEmailBody(InputStream inputStream, String contentType, Function1<? super MediaUploadListener2, Unit> block) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(block, "block");
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        block.invoke(mediaUploadListener2);
        setEmailBody(inputStream, contentType, mediaUploadListener2.build());
    }

    public final void setEmailBody(InputStream inputStream, String contentType) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        setEmailBody(inputStream, contentType, (MediaUploadListener) null);
    }

    public final void setEmailHistory(String emailHistory, String contentType) {
        Intrinsics.checkNotNullParameter(emailHistory, "emailHistory");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.builder.setEmailHistory(emailHistory, contentType);
    }

    public static /* synthetic */ void setEmailHistory$default(MessageBuilder messageBuilder, InputStream inputStream, String str, MediaUploadListener mediaUploadListener, int i, Object obj) {
        if ((i & 4) != 0) {
            mediaUploadListener = null;
        }
        messageBuilder.setEmailHistory(inputStream, str, mediaUploadListener);
    }

    public final void setEmailHistory(InputStream inputStream, String contentType, MediaUploadListener listener) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.builder.setEmailHistory(inputStream, contentType, listener);
    }

    public static /* synthetic */ void setEmailHistory$default(MessageBuilder messageBuilder, InputStream inputStream, String contentType, Function1 block, int i, Object obj) {
        if ((i & 4) != 0) {
            block = new Function1<MediaUploadListener2, Unit>() { // from class: com.twilio.conversations.extensions.MessageBuilder.setEmailHistory.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MediaUploadListener2 mediaUploadListener2) {
                    Intrinsics.checkNotNullParameter(mediaUploadListener2, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediaUploadListener2 mediaUploadListener2) {
                    invoke2(mediaUploadListener2);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(block, "block");
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        block.invoke(mediaUploadListener2);
        messageBuilder.setEmailHistory(inputStream, contentType, mediaUploadListener2.build());
    }

    public final void setEmailHistory(InputStream inputStream, String contentType, Function1<? super MediaUploadListener2, Unit> block) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(block, "block");
        MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
        block.invoke(mediaUploadListener2);
        setEmailHistory(inputStream, contentType, mediaUploadListener2.build());
    }

    public final void setEmailHistory(InputStream inputStream, String contentType) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        setEmailHistory(inputStream, contentType, (MediaUploadListener) null);
    }

    @PublishedApi
    public final Conversation.UnsentMessage build() {
        Conversation.UnsentMessage unsentMessageBuild = this.builder.setBody(this.body).setSubject(this.subject).setAttributes(this.attributes).setContentTemplate(this.contentTemplateSid, this.contentTemplateVariables).build();
        Intrinsics.checkNotNullExpressionValue(unsentMessageBuild, "build(...)");
        return unsentMessageBuild;
    }
}
