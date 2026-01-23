package com.robinhood.utils.compose.extensions;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: LazyListScope.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: com.robinhood.utils.compose.extensions.LazyListScopeKt$itemsIndexedWithPrefix$generateKey$1, reason: use source file name */
/* loaded from: classes12.dex */
public final class LazyListScope3<T> implements Function2<Integer, T, String> {
    final /* synthetic */ Function2<Integer, T, String> $key;
    final /* synthetic */ String $keyPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListScope3(String str, Function2<? super Integer, ? super T, String> function2) {
        this.$keyPrefix = str;
        this.$key = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Integer num, Object obj) {
        return invoke(num.intValue(), (int) obj);
    }

    public final String invoke(int i, T t) {
        return this.$keyPrefix + "-" + ((Object) this.$key.invoke(Integer.valueOf(i), t));
    }
}
