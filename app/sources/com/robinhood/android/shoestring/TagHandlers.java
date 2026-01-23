package com.robinhood.android.shoestring;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.shoestring.TagHandler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TagHandlers.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J-\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aj\u0002`\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J-\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aj\u0002`\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b$J5\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aj\u0002`\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b'J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/shoestring/TagHandlers;", "", "handlers", "", "Lcom/robinhood/android/shoestring/TagHandler;", "<init>", "(Ljava/util/Set;)V", "", "([Lcom/robinhood/android/shoestring/TagHandler;)V", "getHandlers", "()Ljava/util/Set;", "plus", "other", "handler", "inlineHandlers", "", "Lcom/robinhood/android/shoestring/TagHandler$Inline;", "getInlineHandlers", "()Ljava/util/List;", "inlineHandlers$delegate", "Lkotlin/Lazy;", "openCloseHandlers", "Lcom/robinhood/android/shoestring/TagHandler$OpenClose;", "getOpenCloseHandlers", "openCloseHandlers$delegate", "handleInlineNode", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "tagText", "", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "handleInlineNode$lib_shoestring_externalDebug", "handleNodeOpen", "handleNodeOpen$lib_shoestring_externalDebug", "handleNodeClose", "closingTagText", "handleNodeClose$lib_shoestring_externalDebug", "component1", "copy", "equals", "", "hashCode", "", "toString", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class TagHandlers {
    public static final int $stable = 8;
    private final Set<TagHandler> handlers;

    /* renamed from: inlineHandlers$delegate, reason: from kotlin metadata */
    private final Lazy inlineHandlers;

    /* renamed from: openCloseHandlers$delegate, reason: from kotlin metadata */
    private final Lazy openCloseHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagHandlers copy$default(TagHandlers tagHandlers, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = tagHandlers.handlers;
        }
        return tagHandlers.copy(set);
    }

    public final Set<TagHandler> component1() {
        return this.handlers;
    }

    public final TagHandlers copy(Set<? extends TagHandler> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        return new TagHandlers(handlers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TagHandlers) && Intrinsics.areEqual(this.handlers, ((TagHandlers) other).handlers);
    }

    public int hashCode() {
        return this.handlers.hashCode();
    }

    public String toString() {
        return "TagHandlers(handlers=" + this.handlers + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TagHandlers(Set<? extends TagHandler> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.handlers = handlers;
        this.inlineHandlers = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.shoestring.TagHandlers$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TagHandlers.inlineHandlers_delegate$lambda$0(this.f$0);
            }
        });
        this.openCloseHandlers = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.shoestring.TagHandlers$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TagHandlers.openCloseHandlers_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final Set<TagHandler> getHandlers() {
        return this.handlers;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagHandlers(TagHandler... handlers) {
        this((Set<? extends TagHandler>) ArraysKt.toSet(handlers));
        Intrinsics.checkNotNullParameter(handlers, "handlers");
    }

    public final TagHandlers plus(TagHandlers other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TagHandlers((Set<? extends TagHandler>) SetsKt.plus((Set) this.handlers, (Iterable) other.handlers));
    }

    public final TagHandlers plus(TagHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new TagHandlers((Set<? extends TagHandler>) SetsKt.plus(this.handlers, handler));
    }

    private final List<TagHandler.Inline> getInlineHandlers() {
        return (List) this.inlineHandlers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List inlineHandlers_delegate$lambda$0(TagHandlers tagHandlers) {
        Set<TagHandler> set = tagHandlers.handlers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof TagHandler.Inline) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<TagHandler.OpenClose> getOpenCloseHandlers() {
        return (List) this.openCloseHandlers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List openCloseHandlers_delegate$lambda$1(TagHandlers tagHandlers) {
        Set<TagHandler> set = tagHandlers.handlers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof TagHandler.OpenClose) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ImmutableMap<String, InlineTextContent> handleInlineNode$lib_shoestring_externalDebug(CharSequence tagText, AnnotatedString.Builder builder) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(builder, "builder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (TagHandler.Inline inline : getInlineHandlers()) {
            if (inline.handlesTagText(tagText)) {
                linkedHashMap.putAll(inline.applyInline(builder, tagText));
                z = true;
            }
        }
        if (!z) {
            builder.append("{{" + ((Object) tagText) + "/}}");
        }
        return extensions2.toImmutableMap(linkedHashMap);
    }

    public final ImmutableMap<String, InlineTextContent> handleNodeOpen$lib_shoestring_externalDebug(CharSequence tagText, AnnotatedString.Builder builder) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(builder, "builder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (TagHandler.OpenClose openClose : getOpenCloseHandlers()) {
            if (openClose.handlesOpenTagText(tagText)) {
                linkedHashMap.putAll(openClose.applyOpen(builder, tagText));
                z = true;
            }
        }
        if (!z) {
            builder.append("{{" + ((Object) tagText) + "}}");
        }
        return extensions2.toImmutableMap(linkedHashMap);
    }

    public final ImmutableMap<String, InlineTextContent> handleNodeClose$lib_shoestring_externalDebug(CharSequence tagText, CharSequence closingTagText, AnnotatedString.Builder builder) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        Intrinsics.checkNotNullParameter(closingTagText, "closingTagText");
        Intrinsics.checkNotNullParameter(builder, "builder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (TagHandler.OpenClose openClose : getOpenCloseHandlers()) {
            if (openClose.handlesCloseTagText(closingTagText, tagText)) {
                linkedHashMap.putAll(openClose.applyClose(builder, closingTagText, tagText));
                z = true;
            }
        }
        if (!z) {
            builder.append("{{/" + ((Object) closingTagText) + "}}");
        }
        return extensions2.toImmutableMap(linkedHashMap);
    }
}
