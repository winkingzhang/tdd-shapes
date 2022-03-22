using FluentAssertions;

using System;

using Xunit;

namespace tdd.shapes.tests;

public class ShapeTest
{
    [Fact]
    public void Should_Throw_Exception_When_Invoke_Area()
    {
        var shape = new Shape();

        FluentActions.Invoking(() => shape.Area)
            .Should()
            .Throw<NotImplementedException>();
    }

    [Fact]
    public void Should_Throw_Exception_When_Invoke_Perimeter()
    {
        var shape = new Shape();

        FluentActions.Invoking(() => shape.Perimeter)
            .Should()
            .Throw<NotImplementedException>();
    }
}