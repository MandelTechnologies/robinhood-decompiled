package com.robinhood.contentful.json;

import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Moshi.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"addContentfulJsonAdapters", "", "Lcom/squareup/moshi/Moshi$Builder;", "contentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "lib-contentful_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.contentful.json.MoshiKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class Moshi2 {
    public static final void addContentfulJsonAdapters(Moshi.Builder builder, ContentTypeBindingRegistry contentTypeBindingRegistry) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
        builder.add((JsonAdapter.Factory) RichNodeJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) TextMarkJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) AssetFileJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) ContentTypeFieldJsonAdapterFactory.INSTANCE);
        builder.add((JsonAdapter.Factory) new ResourceMetadataAdapterFactory(contentTypeBindingRegistry));
        builder.add((JsonAdapter.Factory) new ContentResourceJsonAdapterFactory(contentTypeBindingRegistry));
        MarkdownContentJsonAdapter markdownContentJsonAdapter = MarkdownContentJsonAdapter.INSTANCE;
        Types types = Types.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(builder.add(new TypeToken<MarkdownContent>() { // from class: com.robinhood.contentful.json.MoshiKt$addContentfulJsonAdapters$$inlined$addAdapter$1
        }.getType(), markdownContentJsonAdapter), "add(...)");
    }
}
