package com.robinhood.android.shoestring;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TagHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/shoestring/TagHandler;", "", "OpenClose", "Inline", "Companion", "Lcom/robinhood/android/shoestring/TagHandler$Inline;", "Lcom/robinhood/android/shoestring/TagHandler$OpenClose;", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface TagHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: TagHandler.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/shoestring/TagHandler$Inline;", "Lcom/robinhood/android/shoestring/TagHandler;", "handlesTagText", "", "tagText", "", "applyInline", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Inline extends TagHandler {
        ImmutableMap<String, InlineTextContent> applyInline(AnnotatedString.Builder builder, CharSequence tagText);

        boolean handlesTagText(CharSequence tagText);
    }

    /* compiled from: TagHandler.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H&J0\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/shoestring/TagHandler$OpenClose;", "Lcom/robinhood/android/shoestring/TagHandler;", "handlesOpenTagText", "", "openingTagText", "", "handlesCloseTagText", "closingTagText", "applyOpen", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "openTagText", "applyClose", "closeTagText", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OpenClose extends TagHandler {
        ImmutableMap<String, InlineTextContent> applyClose(AnnotatedString.Builder builder, CharSequence closeTagText, CharSequence openTagText);

        ImmutableMap<String, InlineTextContent> applyOpen(AnnotatedString.Builder builder, CharSequence openTagText);

        boolean handlesCloseTagText(CharSequence closingTagText, CharSequence openingTagText);

        boolean handlesOpenTagText(CharSequence openingTagText);
    }

    /* compiled from: TagHandler.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/shoestring/TagHandler$Companion;", "", "<init>", "()V", "EMPTY_INLINE_CONTENT_MAP", "Lkotlinx/collections/immutable/PersistentMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "getEMPTY_INLINE_CONTENT_MAP", "()Lkotlinx/collections/immutable/PersistentMap;", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ImmutableMap3<String, InlineTextContent> EMPTY_INLINE_CONTENT_MAP = extensions2.persistentMapOf();

        private Companion() {
        }

        public final ImmutableMap3<String, InlineTextContent> getEMPTY_INLINE_CONTENT_MAP() {
            return EMPTY_INLINE_CONTENT_MAP;
        }
    }
}
