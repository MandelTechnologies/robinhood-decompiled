package com.robinhood.android.lib.accountswitcher;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0007\bR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSection;", "T", "", "rows", "", "getRows", "()Ljava/util/List;", "WithHeader", "WithoutHeader", "Lcom/robinhood/android/lib/accountswitcher/AccountSection$WithHeader;", "Lcom/robinhood/android/lib/accountswitcher/AccountSection$WithoutHeader;", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSection, reason: use source file name */
/* loaded from: classes8.dex */
public interface AccountSwitcherUtils<T> {
    List<T> getRows();

    /* compiled from: AccountSwitcherUtils.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSection$WithHeader;", "T", "Lcom/robinhood/android/lib/accountswitcher/AccountSection;", "rows", "", "headerText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/util/List;Lcom/robinhood/utils/resource/StringResource;)V", "getRows", "()Ljava/util/List;", "getHeaderText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSection$WithHeader, reason: from toString */
    public static final /* data */ class WithHeader<T> implements AccountSwitcherUtils<T> {
        public static final int $stable = 8;
        private final StringResource headerText;
        private final List<T> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithHeader copy$default(WithHeader withHeader, List list, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                list = withHeader.rows;
            }
            if ((i & 2) != 0) {
                stringResource = withHeader.headerText;
            }
            return withHeader.copy(list, stringResource);
        }

        public final List<T> component1() {
            return this.rows;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getHeaderText() {
            return this.headerText;
        }

        public final WithHeader<T> copy(List<? extends T> rows, StringResource headerText) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            return new WithHeader<>(rows, headerText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithHeader)) {
                return false;
            }
            WithHeader withHeader = (WithHeader) other;
            return Intrinsics.areEqual(this.rows, withHeader.rows) && Intrinsics.areEqual(this.headerText, withHeader.headerText);
        }

        public int hashCode() {
            return (this.rows.hashCode() * 31) + this.headerText.hashCode();
        }

        public String toString() {
            return "WithHeader(rows=" + this.rows + ", headerText=" + this.headerText + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WithHeader(List<? extends T> rows, StringResource headerText) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            this.rows = rows;
            this.headerText = headerText;
        }

        @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherUtils
        public List<T> getRows() {
            return this.rows;
        }

        public final StringResource getHeaderText() {
            return this.headerText;
        }
    }

    /* compiled from: AccountSwitcherUtils.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSection$WithoutHeader;", "T", "Lcom/robinhood/android/lib/accountswitcher/AccountSection;", "rows", "", "<init>", "(Ljava/util/List;)V", "getRows", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSection$WithoutHeader, reason: from toString */
    public static final /* data */ class WithoutHeader<T> implements AccountSwitcherUtils<T> {
        public static final int $stable = 8;
        private final List<T> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithoutHeader copy$default(WithoutHeader withoutHeader, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = withoutHeader.rows;
            }
            return withoutHeader.copy(list);
        }

        public final List<T> component1() {
            return this.rows;
        }

        public final WithoutHeader<T> copy(List<? extends T> rows) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new WithoutHeader<>(rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithoutHeader) && Intrinsics.areEqual(this.rows, ((WithoutHeader) other).rows);
        }

        public int hashCode() {
            return this.rows.hashCode();
        }

        public String toString() {
            return "WithoutHeader(rows=" + this.rows + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WithoutHeader(List<? extends T> rows) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.rows = rows;
        }

        @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherUtils
        public List<T> getRows() {
            return this.rows;
        }
    }
}
