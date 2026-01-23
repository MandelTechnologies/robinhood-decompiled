package com.robinhood.contentful.markdown;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.elements.SecondaryText;
import com.robinhood.android.markdown.elements.Underline;
import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.BlockNode;
import com.robinhood.contentful.model.BlockQuote;
import com.robinhood.contentful.model.Document;
import com.robinhood.contentful.model.EmbedBlock;
import com.robinhood.contentful.model.EmbeddedAsset;
import com.robinhood.contentful.model.EmbeddedEntry;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.Heading;
import com.robinhood.contentful.model.Hyperlink;
import com.robinhood.contentful.model.LinkBlock;
import com.robinhood.contentful.model.ListBlock;
import com.robinhood.contentful.model.ListItem;
import com.robinhood.contentful.model.OrderedList;
import com.robinhood.contentful.model.Paragraph;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.RichNode;
import com.robinhood.contentful.model.Text;
import com.robinhood.contentful.model.TextMark;
import com.robinhood.contentful.model.ThematicBreak;
import com.robinhood.contentful.model.UnorderedList;
import com.robinhood.contentful.render.AssetRenderer;
import com.robinhood.contentful.render.EntryRenderer;
import com.robinhood.contentful.repository.ContentRepository;
import dispatch.core.Suspend;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import okio.Source;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.Emphasis;
import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.node.StrongEmphasis;

/* compiled from: ContentRenderer.kt */
@Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J0\u0010\f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0087@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0018H\u0002J\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\f\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010 J\u0016\u0010\f\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010#J\u0016\u0010\f\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020%H\u0082@¢\u0006\u0002\u0010&J\u0016\u0010\f\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\u0016\u0010\f\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u0016\u0010\f\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020.H\u0082@¢\u0006\u0002\u0010/J\u0016\u0010\f\u001a\u0002002\u0006\u0010\u000e\u001a\u000201H\u0082@¢\u0006\u0002\u00102J\u0016\u0010\f\u001a\u0002032\u0006\u0010\u000e\u001a\u000204H\u0082@¢\u0006\u0002\u00105J\u001c\u0010\f\u001a\u0004\u0018\u00010\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u000306H\u0082@¢\u0006\u0002\u00107J\u0016\u0010\f\u001a\u0002082\u0006\u0010\u000e\u001a\u000209H\u0082@¢\u0006\u0002\u0010:J\u001c\u0010\f\u001a\u0004\u0018\u00010\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030;H\u0082@¢\u0006\u0002\u0010<J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030=0\u0012H\u0083@¢\u0006\u0004\b>\u0010?J\u001c\u0010\f\u001a\u0004\u0018\u00010\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030@H\u0082@¢\u0006\u0002\u0010AJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020BH\u0082@¢\u0006\u0002\u0010CJ\u001a\u0010D\u001a\u00020E*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010FR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, m3636d2 = {"Lcom/robinhood/contentful/markdown/ContentRenderer;", "", "repository", "Lcom/robinhood/contentful/repository/ContentRepository;", "contentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "entryRendererRegistry", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "assetRendererRegistry", "Lcom/robinhood/contentful/render/AssetRenderer$Registry;", "<init>", "(Lcom/robinhood/contentful/repository/ContentRepository;Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;Lcom/robinhood/contentful/render/EntryRenderer$Registry;Lcom/robinhood/contentful/render/AssetRenderer$Registry;)V", "render", "Lorg/commonmark/node/Node;", "node", "Lcom/robinhood/contentful/model/RichNode;", "(Lcom/robinhood/contentful/model/RichNode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "link", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "localeOverride", "Ljava/util/Locale;", "renderAssetLink", "(Lcom/robinhood/contentful/model/ResourceLink;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/contentful/model/Text;", "Lcom/robinhood/contentful/model/BlockNode;", "(Lcom/robinhood/contentful/model/BlockNode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/ThematicBreak;", "Lcom/robinhood/contentful/model/ThematicBreak;", "(Lcom/robinhood/contentful/model/ThematicBreak;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/Heading;", "Lcom/robinhood/contentful/model/Heading;", "(Lcom/robinhood/contentful/model/Heading;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/ListBlock;", "Lcom/robinhood/contentful/model/ListBlock;", "(Lcom/robinhood/contentful/model/ListBlock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/OrderedList;", "Lcom/robinhood/contentful/model/OrderedList;", "(Lcom/robinhood/contentful/model/OrderedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/BulletList;", "Lcom/robinhood/contentful/model/UnorderedList;", "(Lcom/robinhood/contentful/model/UnorderedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/ListItem;", "Lcom/robinhood/contentful/model/ListItem;", "(Lcom/robinhood/contentful/model/ListItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/Paragraph;", "Lcom/robinhood/contentful/model/Paragraph;", "(Lcom/robinhood/contentful/model/Paragraph;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/BlockQuote;", "Lcom/robinhood/contentful/model/BlockQuote;", "(Lcom/robinhood/contentful/model/BlockQuote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/Document;", "Lcom/robinhood/contentful/model/Document;", "(Lcom/robinhood/contentful/model/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/contentful/model/LinkBlock;", "(Lcom/robinhood/contentful/model/LinkBlock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/commonmark/node/Link;", "Lcom/robinhood/contentful/model/Hyperlink;", "(Lcom/robinhood/contentful/model/Hyperlink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/contentful/model/EmbedBlock;", "(Lcom/robinhood/contentful/model/EmbedBlock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/contentful/model/EntryResource;", "renderResourceLink", "(Lcom/robinhood/contentful/model/ResourceLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/contentful/model/EmbeddedEntry;", "(Lcom/robinhood/contentful/model/EmbeddedEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/contentful/model/EmbeddedAsset;", "(Lcom/robinhood/contentful/model/EmbeddedAsset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appendChildrenFrom", "", "(Lorg/commonmark/node/Node;Lcom/robinhood/contentful/model/BlockNode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ContentRenderer {
    private final AssetRenderer.Registry assetRendererRegistry;
    private final ContentTypeBindingRegistry contentTypeBindingRegistry;
    private final EntryRenderer.Registry entryRendererRegistry;
    private final ContentRepository repository;

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextMark.values().length];
            try {
                iArr[TextMark.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextMark.CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextMark.ITALIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextMark.SECONDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextMark.UNDERLINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "appendChildrenFrom")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$appendChildrenFrom$1 */
    static final class C327351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C327351(Continuation<? super C327351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.appendChildrenFrom(null, null, this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$11 */
    static final class C3273711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3273711(Continuation<? super C3273711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((Heading) null, (Continuation<? super org.commonmark.node.Heading>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$14 */
    static final class C3273814 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3273814(Continuation<? super C3273814> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((OrderedList) null, (Continuation<? super org.commonmark.node.OrderedList>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$16 */
    static final class C3273916 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3273916(Continuation<? super C3273916> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((UnorderedList) null, (Continuation<? super BulletList>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$18 */
    static final class C3274018 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3274018(Continuation<? super C3274018> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((ListItem) null, (Continuation<? super org.commonmark.node.ListItem>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {90, 93}, m3647m = "renderAssetLink")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$2 */
    static final class C327412 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327412(Continuation<? super C327412> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.renderAssetLink(null, null, this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$20 */
    static final class C3274220 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3274220(Continuation<? super C3274220> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((Paragraph) null, (Continuation<? super org.commonmark.node.Paragraph>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {165}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$22 */
    static final class C3274322 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3274322(Continuation<? super C3274322> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((BlockQuote) null, (Continuation<? super org.commonmark.node.BlockQuote>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$24 */
    static final class C3274424 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3274424(Continuation<? super C3274424> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((Document) null, (Continuation<? super org.commonmark.node.Document>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$27 */
    static final class C3274527 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3274527(Continuation<? super C3274527> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((Hyperlink) null, (Continuation<? super Link>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "renderResourceLink")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$30 */
    static final class C3274730 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C3274730(Continuation<? super C3274730> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.renderResourceLink(null, this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {200, 201}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$31 */
    static final class C3274831 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3274831(Continuation<? super C3274831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((EmbeddedEntry<?>) null, (Continuation<? super Node>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$33 */
    static final class C3274933 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C3274933(Continuation<? super C3274933> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((EmbeddedAsset) null, (Continuation<? super Node>) this);
        }
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$9 */
    static final class C327509 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C327509(Continuation<? super C327509> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentRenderer.this.render((ThematicBreak) null, (Continuation<? super org.commonmark.node.ThematicBreak>) this);
        }
    }

    public ContentRenderer(ContentRepository repository, ContentTypeBindingRegistry contentTypeBindingRegistry, EntryRenderer.Registry entryRendererRegistry, AssetRenderer.Registry assetRendererRegistry) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
        Intrinsics.checkNotNullParameter(entryRendererRegistry, "entryRendererRegistry");
        Intrinsics.checkNotNullParameter(assetRendererRegistry, "assetRendererRegistry");
        this.repository = repository;
        this.contentTypeBindingRegistry = contentTypeBindingRegistry;
        this.entryRendererRegistry = entryRendererRegistry;
        this.assetRendererRegistry = assetRendererRegistry;
    }

    public final Object render(RichNode richNode, Continuation<? super Node> continuation) throws IOException {
        if (richNode instanceof Text) {
            return render((Text) richNode);
        }
        if (richNode instanceof BlockNode) {
            return render((BlockNode) richNode, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Object renderAssetLink$default(ContentRenderer contentRenderer, ResourceLink resourceLink, Locale locale, Continuation continuation, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            locale = null;
        }
        return contentRenderer.renderAssetLink(resourceLink, locale, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object renderAssetLink(ResourceLink<? extends AssetResource<?>> resourceLink, Locale locale, Continuation<? super Node> continuation) throws IOException {
        C327412 c327412;
        if (continuation instanceof C327412) {
            c327412 = (C327412) continuation;
            int i = c327412.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327412.label = i - Integer.MIN_VALUE;
            } else {
                c327412 = new C327412(continuation);
            }
        }
        Object objLoad = c327412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad);
            ContentRepository contentRepository = this.repository;
            c327412.label = 1;
            objLoad = contentRepository.load(resourceLink, locale, c327412);
            if (objLoad != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoad);
            return objLoad;
        }
        ResultKt.throwOnFailure(objLoad);
        Intrinsics.checkNotNull(objLoad, "null cannot be cast to non-null type com.robinhood.contentful.model.AssetResource<com.robinhood.contentful.model.AssetDetail>");
        AssetResource assetResource = (AssetResource) objLoad;
        AssetResource.File file = assetResource.getContent().getFile();
        C327463 c327463 = new C327463(file, this.assetRendererRegistry.get(file.getMediaType()), assetResource, null);
        c327412.label = 2;
        Object objWithIO$default = Suspend.withIO$default(null, c327463, c327412, 1, null);
        return objWithIO$default == coroutine_suspended ? coroutine_suspended : objWithIO$default;
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lorg/commonmark/node/Node;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer$render$3", m3645f = "ContentRenderer.kt", m3646l = {94, 94}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$render$3 */
    static final class C327463 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Node>, Object> {
        final /* synthetic */ AssetResource<AssetDetail> $asset;
        final /* synthetic */ AssetResource.File<AssetDetail> $file;
        final /* synthetic */ AssetRenderer<AssetDetail> $renderer;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327463(AssetResource.File<AssetDetail> file, AssetRenderer<AssetDetail> assetRenderer, AssetResource<AssetDetail> assetResource, Continuation<? super C327463> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$renderer = assetRenderer;
            this.$asset = assetResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContentRenderer.this.new C327463(this.$file, this.$renderer, this.$asset, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Node> continuation) {
            return ((C327463) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (r11 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C327463 c327463;
            Closeable closeable;
            AssetRenderer<AssetDetail> assetRenderer;
            AssetResource assetResource;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ContentRepository contentRepository = ContentRenderer.this.repository;
                    AssetResource.File<AssetDetail> file = this.$file;
                    this.label = 1;
                    c327463 = this;
                    obj = ContentRepository.DefaultImpls.open$default(contentRepository, file, null, c327463, 2, null);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Node node = (Node) obj;
                        kotlin.p481io.Closeable.closeFinally(closeable, null);
                        return node;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            kotlin.p481io.Closeable.closeFinally(closeable, th);
                            throw th3;
                        }
                    }
                }
                ResultKt.throwOnFailure(obj);
                c327463 = this;
                c327463.L$0 = closeable;
                c327463.label = 2;
                obj = assetRenderer.render(assetResource, (Source) closeable, this);
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
            closeable = (Closeable) obj;
            assetRenderer = c327463.$renderer;
            assetResource = c327463.$asset;
        }
    }

    private final Node render(Text node) {
        Node strongEmphasis;
        Set<TextMark> marks = node.getMarks();
        Node code = marks.contains(TextMark.CODE) ? new Code(node.getValue()) : new org.commonmark.node.Text(node.getValue());
        Iterator<TextMark> it = marks.iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[it.next().ordinal()];
            if (i == 1) {
                strongEmphasis = new StrongEmphasis("*");
                strongEmphasis.appendChild(code);
            } else if (i == 2) {
                continue;
            } else if (i == 3) {
                strongEmphasis = new Emphasis("/");
                strongEmphasis.appendChild(code);
            } else if (i == 4) {
                strongEmphasis = new SecondaryText();
                strongEmphasis.appendChild(code);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                strongEmphasis = new Underline("_");
                strongEmphasis.appendChild(code);
            }
            code = strongEmphasis;
        }
        return code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object render(BlockNode blockNode, Continuation<? super Node> continuation) {
        if (blockNode instanceof Heading) {
            Object objRender = render((Heading) blockNode, (Continuation<? super org.commonmark.node.Heading>) continuation);
            return objRender == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender : (Node) objRender;
        }
        if (blockNode instanceof ThematicBreak) {
            Object objRender2 = render((ThematicBreak) blockNode, (Continuation<? super org.commonmark.node.ThematicBreak>) continuation);
            return objRender2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender2 : (Node) objRender2;
        }
        if (blockNode instanceof ListBlock) {
            Object objRender3 = render((ListBlock) blockNode, (Continuation<? super org.commonmark.node.ListBlock>) continuation);
            return objRender3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender3 : (Node) objRender3;
        }
        if (blockNode instanceof ListItem) {
            Object objRender4 = render((ListItem) blockNode, (Continuation<? super org.commonmark.node.ListItem>) continuation);
            return objRender4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender4 : (Node) objRender4;
        }
        if (blockNode instanceof Paragraph) {
            Object objRender5 = render((Paragraph) blockNode, (Continuation<? super org.commonmark.node.Paragraph>) continuation);
            return objRender5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender5 : (Node) objRender5;
        }
        if (blockNode instanceof BlockQuote) {
            Object objRender6 = render((BlockQuote) blockNode, (Continuation<? super org.commonmark.node.BlockQuote>) continuation);
            return objRender6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender6 : (Node) objRender6;
        }
        if (blockNode instanceof Document) {
            Object objRender7 = render((Document) blockNode, (Continuation<? super org.commonmark.node.Document>) continuation);
            return objRender7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender7 : (Node) objRender7;
        }
        if (blockNode instanceof LinkBlock) {
            return render((LinkBlock<?>) blockNode, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(ThematicBreak thematicBreak, Continuation<? super org.commonmark.node.ThematicBreak> continuation) {
        C327509 c327509;
        if (continuation instanceof C327509) {
            c327509 = (C327509) continuation;
            int i = c327509.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327509.label = i - Integer.MIN_VALUE;
            } else {
                c327509 = new C327509(continuation);
            }
        }
        Object obj = c327509.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327509.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.commonmark.node.ThematicBreak thematicBreak2 = (org.commonmark.node.ThematicBreak) c327509.L$0;
            ResultKt.throwOnFailure(obj);
            return thematicBreak2;
        }
        ResultKt.throwOnFailure(obj);
        Node thematicBreak3 = new org.commonmark.node.ThematicBreak();
        c327509.L$0 = thematicBreak3;
        c327509.label = 1;
        return appendChildrenFrom(thematicBreak3, thematicBreak, c327509) == coroutine_suspended ? coroutine_suspended : thematicBreak3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Heading heading, Continuation<? super org.commonmark.node.Heading> continuation) {
        C3273711 c3273711;
        if (continuation instanceof C3273711) {
            c3273711 = (C3273711) continuation;
            int i = c3273711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3273711.label = i - Integer.MIN_VALUE;
            } else {
                c3273711 = new C3273711(continuation);
            }
        }
        Object obj = c3273711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3273711.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.commonmark.node.Heading heading2 = (org.commonmark.node.Heading) c3273711.L$0;
            ResultKt.throwOnFailure(obj);
            return heading2;
        }
        ResultKt.throwOnFailure(obj);
        org.commonmark.node.Heading heading3 = new org.commonmark.node.Heading();
        heading3.setLevel(heading.getLevel());
        c3273711.L$0 = heading3;
        c3273711.label = 1;
        return appendChildrenFrom(heading3, heading, c3273711) == coroutine_suspended ? coroutine_suspended : heading3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object render(ListBlock listBlock, Continuation<? super org.commonmark.node.ListBlock> continuation) {
        if (listBlock instanceof OrderedList) {
            Object objRender = render((OrderedList) listBlock, (Continuation<? super org.commonmark.node.OrderedList>) continuation);
            return objRender == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender : (org.commonmark.node.ListBlock) objRender;
        }
        if (!(listBlock instanceof UnorderedList)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objRender2 = render((UnorderedList) listBlock, (Continuation<? super BulletList>) continuation);
        return objRender2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender2 : (org.commonmark.node.ListBlock) objRender2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(OrderedList orderedList, Continuation<? super org.commonmark.node.OrderedList> continuation) {
        C3273814 c3273814;
        if (continuation instanceof C3273814) {
            c3273814 = (C3273814) continuation;
            int i = c3273814.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3273814.label = i - Integer.MIN_VALUE;
            } else {
                c3273814 = new C3273814(continuation);
            }
        }
        Object obj = c3273814.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3273814.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.commonmark.node.OrderedList orderedList2 = (org.commonmark.node.OrderedList) c3273814.L$0;
            ResultKt.throwOnFailure(obj);
            return orderedList2;
        }
        ResultKt.throwOnFailure(obj);
        org.commonmark.node.OrderedList orderedList3 = new org.commonmark.node.OrderedList();
        orderedList3.setStartNumber(1);
        c3273814.L$0 = orderedList3;
        c3273814.label = 1;
        return appendChildrenFrom(orderedList3, orderedList, c3273814) == coroutine_suspended ? coroutine_suspended : orderedList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(UnorderedList unorderedList, Continuation<? super BulletList> continuation) {
        C3273916 c3273916;
        if (continuation instanceof C3273916) {
            c3273916 = (C3273916) continuation;
            int i = c3273916.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3273916.label = i - Integer.MIN_VALUE;
            } else {
                c3273916 = new C3273916(continuation);
            }
        }
        Object obj = c3273916.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3273916.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BulletList bulletList = (BulletList) c3273916.L$0;
            ResultKt.throwOnFailure(obj);
            return bulletList;
        }
        ResultKt.throwOnFailure(obj);
        Node bulletList2 = new BulletList();
        c3273916.L$0 = bulletList2;
        c3273916.label = 1;
        return appendChildrenFrom(bulletList2, unorderedList, c3273916) == coroutine_suspended ? coroutine_suspended : bulletList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(ListItem listItem, Continuation<? super org.commonmark.node.ListItem> continuation) {
        C3274018 c3274018;
        if (continuation instanceof C3274018) {
            c3274018 = (C3274018) continuation;
            int i = c3274018.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274018.label = i - Integer.MIN_VALUE;
            } else {
                c3274018 = new C3274018(continuation);
            }
        }
        Object obj = c3274018.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3274018.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.commonmark.node.ListItem listItem2 = (org.commonmark.node.ListItem) c3274018.L$0;
            ResultKt.throwOnFailure(obj);
            return listItem2;
        }
        ResultKt.throwOnFailure(obj);
        Node listItem3 = new org.commonmark.node.ListItem();
        c3274018.L$0 = listItem3;
        c3274018.label = 1;
        return appendChildrenFrom(listItem3, listItem, c3274018) == coroutine_suspended ? coroutine_suspended : listItem3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Paragraph paragraph, Continuation<? super org.commonmark.node.Paragraph> continuation) {
        C3274220 c3274220;
        if (continuation instanceof C3274220) {
            c3274220 = (C3274220) continuation;
            int i = c3274220.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274220.label = i - Integer.MIN_VALUE;
            } else {
                c3274220 = new C3274220(continuation);
            }
        }
        Object obj = c3274220.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3274220.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.commonmark.node.Paragraph paragraph2 = (org.commonmark.node.Paragraph) c3274220.L$0;
            ResultKt.throwOnFailure(obj);
            return paragraph2;
        }
        ResultKt.throwOnFailure(obj);
        Node paragraph3 = new org.commonmark.node.Paragraph();
        c3274220.L$0 = paragraph3;
        c3274220.label = 1;
        return appendChildrenFrom(paragraph3, paragraph, c3274220) == coroutine_suspended ? coroutine_suspended : paragraph3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(BlockQuote blockQuote, Continuation<? super org.commonmark.node.BlockQuote> continuation) {
        C3274322 c3274322;
        if (continuation instanceof C3274322) {
            c3274322 = (C3274322) continuation;
            int i = c3274322.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274322.label = i - Integer.MIN_VALUE;
            } else {
                c3274322 = new C3274322(continuation);
            }
        }
        Object obj = c3274322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3274322.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.commonmark.node.BlockQuote blockQuote2 = (org.commonmark.node.BlockQuote) c3274322.L$0;
            ResultKt.throwOnFailure(obj);
            return blockQuote2;
        }
        ResultKt.throwOnFailure(obj);
        Node blockQuote3 = new org.commonmark.node.BlockQuote();
        c3274322.L$0 = blockQuote3;
        c3274322.label = 1;
        return appendChildrenFrom(blockQuote3, blockQuote, c3274322) == coroutine_suspended ? coroutine_suspended : blockQuote3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Document document, Continuation<? super org.commonmark.node.Document> continuation) {
        C3274424 c3274424;
        if (continuation instanceof C3274424) {
            c3274424 = (C3274424) continuation;
            int i = c3274424.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274424.label = i - Integer.MIN_VALUE;
            } else {
                c3274424 = new C3274424(continuation);
            }
        }
        Object obj = c3274424.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3274424.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.commonmark.node.Document document2 = (org.commonmark.node.Document) c3274424.L$0;
            ResultKt.throwOnFailure(obj);
            return document2;
        }
        ResultKt.throwOnFailure(obj);
        Node document3 = new org.commonmark.node.Document();
        c3274424.L$0 = document3;
        c3274424.label = 1;
        return appendChildrenFrom(document3, document, c3274424) == coroutine_suspended ? coroutine_suspended : document3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object render(LinkBlock<?> linkBlock, Continuation<? super Node> continuation) {
        if (linkBlock instanceof Hyperlink) {
            Object objRender = render((Hyperlink) linkBlock, (Continuation<? super Link>) continuation);
            return objRender == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender : (Node) objRender;
        }
        if (linkBlock instanceof EmbedBlock) {
            return render((EmbedBlock<?>) linkBlock, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Hyperlink hyperlink, Continuation<? super Link> continuation) {
        C3274527 c3274527;
        if (continuation instanceof C3274527) {
            c3274527 = (C3274527) continuation;
            int i = c3274527.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274527.label = i - Integer.MIN_VALUE;
            } else {
                c3274527 = new C3274527(continuation);
            }
        }
        Object obj = c3274527.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3274527.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Link link = (Link) c3274527.L$0;
            ResultKt.throwOnFailure(obj);
            return link;
        }
        ResultKt.throwOnFailure(obj);
        Link link2 = new Link();
        link2.setDestination(hyperlink.getTarget().toString());
        c3274527.L$0 = link2;
        c3274527.label = 1;
        return appendChildrenFrom(link2, hyperlink, c3274527) == coroutine_suspended ? coroutine_suspended : link2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object render(EmbedBlock<?> embedBlock, Continuation<? super Node> continuation) throws IOException {
        if (embedBlock instanceof EmbeddedEntry) {
            return render((EmbeddedEntry<?>) embedBlock, continuation);
        }
        if (!(embedBlock instanceof EmbeddedAsset)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objRender = render((EmbeddedAsset) embedBlock, continuation);
        return objRender == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRender : (Node) objRender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object renderResourceLink(ResourceLink<? extends EntryResource<?>> resourceLink, Continuation<? super Node> continuation) {
        C3274730 c3274730;
        if (continuation instanceof C3274730) {
            c3274730 = (C3274730) continuation;
            int i = c3274730.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274730.label = i - Integer.MIN_VALUE;
            } else {
                c3274730 = new C3274730(continuation);
            }
        }
        C3274730 c32747302 = c3274730;
        Object objLoad$default = c32747302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32747302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            ContentRepository contentRepository = this.repository;
            c32747302.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(contentRepository, resourceLink, null, c32747302, 2, null);
            if (objLoad$default != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoad$default);
            return objLoad$default;
        }
        ResultKt.throwOnFailure(objLoad$default);
        EntryResource entryResource = (EntryResource) objLoad$default;
        Class<?> type2 = this.contentTypeBindingRegistry.getType(entryResource.getSys().getContentType().getSys().getId());
        if (type2 == null) {
            return null;
        }
        EntryRenderer entryRenderer = this.entryRendererRegistry.get(type2);
        Object value = entryResource.getValue();
        ContentRepository contentRepository2 = this.repository;
        c32747302.label = 2;
        Object objRender = entryRenderer.render(value, this, contentRepository2, c32747302);
        return objRender == coroutine_suspended ? coroutine_suspended : objRender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(EmbeddedEntry<?> embeddedEntry, Continuation<? super Node> continuation) {
        C3274831 c3274831;
        if (continuation instanceof C3274831) {
            c3274831 = (C3274831) continuation;
            int i = c3274831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274831.label = i - Integer.MIN_VALUE;
            } else {
                c3274831 = new C3274831(continuation);
            }
        }
        Object objRenderResourceLink = c3274831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3274831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRenderResourceLink);
            ResourceLink<? extends EntryResource<?>> target = embeddedEntry.getTarget();
            c3274831.L$0 = embeddedEntry;
            c3274831.label = 1;
            objRenderResourceLink = renderResourceLink(target, c3274831);
            if (objRenderResourceLink != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Node node = (Node) c3274831.L$0;
            ResultKt.throwOnFailure(objRenderResourceLink);
            return node;
        }
        embeddedEntry = (EmbeddedEntry) c3274831.L$0;
        ResultKt.throwOnFailure(objRenderResourceLink);
        Node node2 = (Node) objRenderResourceLink;
        if (node2 == null) {
            return null;
        }
        c3274831.L$0 = node2;
        c3274831.label = 2;
        return appendChildrenFrom(node2, embeddedEntry, c3274831) == coroutine_suspended ? coroutine_suspended : node2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(EmbeddedAsset embeddedAsset, Continuation<? super Node> continuation) throws IOException {
        C3274933 c3274933;
        if (continuation instanceof C3274933) {
            c3274933 = (C3274933) continuation;
            int i = c3274933.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3274933.label = i - Integer.MIN_VALUE;
            } else {
                c3274933 = new C3274933(continuation);
            }
        }
        C3274933 c32749332 = c3274933;
        Object objRenderAssetLink$default = c32749332.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32749332.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRenderAssetLink$default);
            ResourceLink<AssetResource<?>> target = embeddedAsset.getTarget();
            c32749332.L$0 = embeddedAsset;
            c32749332.label = 1;
            objRenderAssetLink$default = renderAssetLink$default(this, target, null, c32749332, 2, null);
            if (objRenderAssetLink$default != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = c32749332.L$0;
            ResultKt.throwOnFailure(objRenderAssetLink$default);
            return obj;
        }
        embeddedAsset = (EmbeddedAsset) c32749332.L$0;
        ResultKt.throwOnFailure(objRenderAssetLink$default);
        c32749332.L$0 = objRenderAssetLink$default;
        c32749332.label = 2;
        return appendChildrenFrom((Node) objRenderAssetLink$default, embeddedAsset, c32749332) == coroutine_suspended ? coroutine_suspended : objRenderAssetLink$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:23:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c1 -> B:30:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object appendChildrenFrom(Node node, BlockNode blockNode, Continuation<? super Unit> continuation) {
        C327351 c327351;
        Node node2;
        Collection collection;
        Iterator it;
        Iterator it2;
        if (continuation instanceof C327351) {
            c327351 = (C327351) continuation;
            int i = c327351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327351.label = i - Integer.MIN_VALUE;
            } else {
                c327351 = new C327351(continuation);
            }
        }
        Object objAwait = c327351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            List<RichNode> content = blockNode.getContent();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(content, 10));
            Iterator it3 = content.iterator();
            node2 = node;
            collection = arrayList;
            it = it3;
            if (it.hasNext()) {
            }
        } else if (i2 == 1) {
            collection = (Collection) c327351.L$3;
            Iterator it4 = (Iterator) c327351.L$2;
            Collection collection2 = (Collection) c327351.L$1;
            Node node3 = (Node) c327351.L$0;
            ResultKt.throwOnFailure(objAwait);
            C327351 c3273512 = c327351;
            Iterator it5 = it4;
            node2 = node3;
            C327351 c3273513 = c3273512;
            collection.add((Deferred) objAwait);
            it = it5;
            collection = collection2;
            c327351 = c3273513;
            if (it.hasNext()) {
                ContentRenderer2 contentRenderer2 = new ContentRenderer2(this, (RichNode) it.next(), null);
                c327351.L$0 = node2;
                c327351.L$1 = collection;
                c327351.L$2 = it;
                c327351.L$3 = collection;
                c327351.label = 1;
                Object objWithDefault$default = Suspend.withDefault$default(null, contentRenderer2, c327351, 1, null);
                if (objWithDefault$default != coroutine_suspended) {
                    c3273513 = c327351;
                    it5 = it;
                    objAwait = objWithDefault$default;
                    collection2 = collection;
                    collection.add((Deferred) objAwait);
                    it = it5;
                    collection = collection2;
                    c327351 = c3273513;
                    if (it.hasNext()) {
                        it2 = ((List) collection).iterator();
                        if (!it2.hasNext()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) c327351.L$1;
            node2 = (Node) c327351.L$0;
            ResultKt.throwOnFailure(objAwait);
            Node node4 = (Node) objAwait;
            if (node4 != null) {
                node2.appendChild(node4);
            }
            if (!it2.hasNext()) {
                Deferred deferred = (Deferred) it2.next();
                c327351.L$0 = node2;
                c327351.L$1 = it2;
                c327351.L$2 = null;
                c327351.L$3 = null;
                c327351.label = 2;
                objAwait = deferred.await(c327351);
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
